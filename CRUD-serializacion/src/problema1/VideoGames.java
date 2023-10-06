package problema1;

public enum VideoGames {
    SPORTS("soccer, ", "You have to run after the ball and take it away from your opponent, ", 2015) {
        @Override
        public String mostrarPosicionRanking() {
            return null;
        }

        @Override
        public String comprarMonedas() {
            return null;
        }
    }, STRATEGY("deceit, ", "Deceiving your opponent, ", 2000) {
        @Override
        public String mostrarPosicionRanking() {
            return null;
        }

        @Override
        public String comprarMonedas() {
            return null;
        }
    }, MUSICALS("ballet, ", "Dance as the screen shows you, ", 2019) {
        @Override
        public String mostrarPosicionRanking() {
            return null;
        }

        @Override
        public String comprarMonedas() {
            return null;
        }
    }, ADVENTURE("search, ", "We are going to give you a crime and 2 clues, you have to discover who committed it, ", 2021) {
        @Override
        public String mostrarPosicionRanking() {
            return null;
        }

        @Override
        public String comprarMonedas() {
            return null;
        }
    }, SIMULATION("Don't trust, ", "In this world you can not trust, earn the trust of other players, watch and listen to everything you can, the more you know the faster you will win, ", 2023) {
        @Override
        public String mostrarPosicionRanking() {
            return null;
        }

        @Override
        public String comprarMonedas() {
            return null;
        }
    };
    private String name;
    private String howtoplay;
    private int yearofcreation;

    VideoGames(String name, String howtoplay, int yearofcreation) {
        this.name = name;
        this.howtoplay = howtoplay;
        this.yearofcreation = yearofcreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowtoplay() {
        return howtoplay;
    }

    public void setHowtoplay(String howtoplay) {
        this.howtoplay = howtoplay;
    }

    public int getYearofcreation() {
        return yearofcreation;
    }

    public void setYearofcreation(int yearofcreation) {
        this.yearofcreation = yearofcreation;
    }
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
}
