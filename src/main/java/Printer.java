public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int sheets, int copies) {
        int pages = sheets * copies;

        if (pages <= paper && pages <= toner) {
//            System.out.println(pages);
            this.paper -= pages;
            this.toner -= pages;
        }
    }

    public void refillAll() {
        this.paper = 100;
        this.toner = 100;
    }
}
