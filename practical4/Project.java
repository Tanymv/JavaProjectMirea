package practical4;
import java.util.Scanner;

public class Project {
        static class weather {

            public static weather[] a;

            public String fam;

            public String name;

            public weather(String fam, String name) {

                this.fam = fam;

                this.name = name;

            }

            public static weather[] CreateArray() {

                weather sdt;

                a = new weather[4];

                for (int j = 0; j < 4; j++) {

                    String fam = "";

                    String name = "";

                    sdt = new weather(fam, name);

                    a[j] = sdt;

                    System.out.println();

                }

                return a;

            }

            public static void print(weather[] a) {

                a[0].fam = "Температура 45*";

                a[1].fam = "Температура -40*";

                a[2].fam = "Температура 20*";

                a[3].fam = "Температура 13*";

                a[0].name = "Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.";

                a[1].name = "Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.";

                a[3].name = "Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)";

                a[2].name = "Весна — одно из четырёх времён года, переходный сезон между зимой и летом";

                for (Project.weather weather : a) {

                    System.out.println("-------------------------------------------------------------------");

                    System.out.println(weather.fam);

                    System.out.println(weather.name);

                    System.out.println("-------------------------------------------------------------------");

                }

                System.out.println();

            }

        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String s;

            System.out.println("Ваше любимая пора года?(лето,зима,осень,весна)");

            s = scanner.nextLine();

            switch (s) {
                case "лето" -> {
                    System.out.print("Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.");
                    System.out.println("В день летнего солнцестояния дни самые длинные, а ночи самые короткие.");
                }
                case "зима" -> {
                    System.out.print("Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.Основной признак этого времени ");
                    System.out.println("года — устойчивая низкая температура(ниже 0 градусов по Цельсию) во многих районах Земли, на поверхность земли выпадает и ложится снег.");
                }
                case "осень" -> {
                    System.out.print("Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)");
                    System.out.println(" — одно из четырёх времен года, между летом и зимой.");
                }
                case "весна" -> {
                    System.out.print("Весна — одно из четырёх времён года, переходный сезон между зимой и летом");
                    System.out.println(" . Существуют различные методы определения начал и окончания весны, отличающиеся в зависимости от местного климата, культур и обычаев. Когда в Северном полушарии весна, то в Южном полушарии осень и наоборот.");
                }
                default -> {
                    System.out.println("Неправильная пора года выхожу!");
                    System.exit(0);
                }
            }

            System.out.println("1-лето");

            System.out.println("2-зима");

            System.out.println("3-весна");

            System.out.println("4-осень");

            int mb = scanner.nextInt();

            TellAboutPariGoda(mb);

            System.out.println("Введите лето или зима");

            String mb1 = scanner.next();

            getDescription(mb1);

            weather[] a;

            a = weather.CreateArray();

            weather.print(a);

            scanner.close();

        }

        private static void getDescription(String s) {

            if (s.equals("лето")) {

                System.out.println("Теплое время года");

            } else if (s.equals("зима")) {

                System.out.println("Холодное время года");

            }

        }

        private static void TellAboutPariGoda(int mb) {

            double sr;

            switch (mb) {

                case 1:

                    sr = 45;

                    System.out.println("Я люблю лето " + sr + "*");

                    break;

                case 2:

                    sr = -40;

                    System.out.println("Я люблю зиму " + sr + "*");

                    break;

                case 3:

                    sr = 20;

                    System.out.println("Я люблю весну " + sr + "*");

                    break;

                case 4:

                    sr = 13;

                    System.out.println("Я люблю осень " + sr + "*");

                    break;

            }

        }

}
