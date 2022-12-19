package work4;


public class Seasons {

    public enum infoSeasons{
        autumn(11), winter(-15), spring(8.2), summer(22.1) {
            public String getDescription() { return "Теплое время года"; }
        };
        public String getDescription(){
            return "Холодное время года";
        }

        private double temperature;
        private infoSeasons(double temperature){
            this.temperature = temperature;
        }


        public double getTemperature() {
            return temperature;
        }
    }

    public static void iLove(infoSeasons season) {
        switch (season){
            case autumn:
                System.out.println("Я люблю осень");
                break;
            case spring:
                System.out.println("Я люблю весну");
                break;
            case winter:
                System.out.println("Я люблю зиму");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
        }
    }

    public static void main(String[] args) {
        infoSeasons season = infoSeasons.autumn;
        iLove(season);
        System.out.println("==============");
        for(infoSeasons seasons : infoSeasons.values()){
            System.out.println(seasons + ": " + seasons.getDescription() + " (средняя температура равна " + seasons.getTemperature() + " градусам)");
        }
    }
}
