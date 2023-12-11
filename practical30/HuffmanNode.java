package practical30;


import java.util.*;

class HuffmanNode implements Comparable<HuffmanNode> {
    char character;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode o) {
        return this.frequency - o.frequency;
    }
}

class Huffman {
    public static void main(String[] args) {
        String str = "Hello, world!";

        Map<Character, Integer> frequencyMap = buildFrequencyMap(str);
        HuffmanNode rootNode = buildHuffmanTree(frequencyMap);

        Map<Character, String> huffmanCodes = generateHuffmanCodes(rootNode);

        System.out.println("Huffman Codes:");
        for (char character : huffmanCodes.keySet()) {
            System.out.println(character + " : " + huffmanCodes.get(character));
        }

        String encodedString = encodeString(str, huffmanCodes);
        System.out.println("Encoded String: " + encodedString);

        String decodedString = decodeString(encodedString, rootNode);
        System.out.println("Decoded String: " + decodedString);
    }

    public static Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : str.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        return frequencyMap;
    }

    public static HuffmanNode buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (char character : frequencyMap.keySet()) {
            pq.add(new HuffmanNode(character, frequencyMap.get(character)));
        }

        while (pq.size() > 1) {
            HuffmanNode node1 = pq.remove();
            HuffmanNode node2 = pq.remove();

            HuffmanNode mergedNode = new HuffmanNode('#', node1.frequency + node2.frequency);
            mergedNode.left = node1;
            mergedNode.right = node2;

            pq.add(mergedNode);
        }

        return pq.remove();
    }

    public static Map<Character, String> generateHuffmanCodes(HuffmanNode rootNode) {
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(rootNode, "", huffmanCodes);
        return huffmanCodes;
    }

    private static void generateCodes(HuffmanNode node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) {
            return;
        }

        if (node.character != '#') {
            huffmanCodes.put(node.character, code);
        }

        generateCodes(node.left, code + "0", huffmanCodes);
        generateCodes(node.right, code + "1", huffmanCodes);
    }

    public static String encodeString(String str, Map<Character, String> huffmanCodes) {
        StringBuilder encodedString = new StringBuilder();
        for (char character : str.toCharArray()) {
            encodedString.append(huffmanCodes.get(character));
        }
        return encodedString.toString();
    }

    public static String decodeString(String encodedString, HuffmanNode rootNode) {
        StringBuilder decodedString = new StringBuilder();
        HuffmanNode current = rootNode;

        for (char bit : encodedString.toCharArray()) {
            if (bit == '0') {
                current = current.left;
            } else if (bit == '1') {
                current = current.right;
            }

            if (current.character != '#') {
                decodedString.append(current.character);
                current = rootNode;
            }
        }

        return decodedString.toString();
    }
}