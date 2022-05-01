public class Magic {
    public static void main(String[] args) throws InterruptedException {
        TestWizard();
    }
    private static void TestWizard() throws InterruptedException{
        Screen screen = new Screen();
        Arthur arthur = new Arthur(
                01,
                "Gryffindor",
                "Masculino",
                "Arthur Weasley",
                "N/A",
                "Comadreja"
        );
        Hermione hermione = new Hermione(
                02,
                "Gryffindor",
                "Femenino",
                "Hemione Jean Granger",
                "Profesora McGonagall",
                "Nutria"
        );
        Snape snape = new Snape(
                03,
                "Slytherin",
                "Masculino",
                "Severus Snape",
                "Lord Voldemort",
                "Cierva"
        );
        Luna luna = new Luna(
                04,
                "Ravenclaw",
                "Femenino",
                "Luna Lovegood",
                "N/A",
                "Liebre"
        );
        Sirius sirius = new Sirius(
                05,
                "Gryffindor",
                "Masculino",
                "Sirius Black",
                "N/A",
                "Perro"
        );
    }
}
