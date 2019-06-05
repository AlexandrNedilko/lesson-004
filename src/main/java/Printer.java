public class Printer {
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;
    private int paperTray;

    public Printer(String manufacturer, String model, boolean isColor,
  String type, boolean isDuplex, int tonerLevelBlack, int tonerLevelMagenta,
                   int tonerLevelYellow, int tonerLevelBlue, int printedPages) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.type = type;
        this.isDuplex = isDuplex;
        this.tonerLevelBlack = tonerLevelBlack;
        this.tonerLevelMagenta = tonerLevelMagenta;
        this.tonerLevelYellow = tonerLevelYellow;
        this.tonerLevelBlue = tonerLevelBlue;
        this.printedPages = printedPages;

    }

    public int getPaperTray() {
        return paperTray;
    }

    public void setPaperTray(int pages ) {

            this.paperTray =   pages;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack -= tonerLevelBlack;
    }

    public int getTonerLevelMagenta() {
        return tonerLevelMagenta;
    }

    public void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta = tonerLevelMagenta;
    }

    public int getTonerLevelYellow() {
        return tonerLevelYellow;
    }

    public void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow = tonerLevelYellow;
    }

    public int getTonerLevelBlue() {
        return tonerLevelBlue;
    }

    public void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue = tonerLevelBlue;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages += printedPages;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", isColor=" + isColor +
                ", type='" + type + '\'' +
                ", isDuplex=" + isDuplex +
                ", tonerLevelBlack=" + tonerLevelBlack +
                ", tonerLevelMagenta=" + tonerLevelMagenta +
                ", tonerLevelYellow=" + tonerLevelYellow +
                ", tonerLevelBlue=" + tonerLevelBlue +
                ", printedPages=" + printedPages +
                ", paperTray=" + paperTray +
                '}';
    }

    public static void main(String[] args) {
        Printer Samsung= new Printer("Samsung", "S00001", true, "Lazer", true
        , 100, 80,80,80,0);
        Samsung.setPaperTray(100);
       Samsung.print(1100, "Black", false);

        System.out.println(Samsung.toString());
    }
    public void fillUp(int tonerVolume, String color){

    }
    public void print(int pages, String color, boolean isDuplex){
        changePrintedPages(pages);
        changeTonerLevel(color,pages);
        changePaperTray(pages,isDuplex);


        System.out.println("Printed "+ pages+ " pages, "+ " color is "+ color+ ", isDuplex "+ isDuplex);
    }

    private void changePaperTray(int pages, boolean isDuplex) {
        if (isDuplex) {
            pages = pages/2;
        }
            int ptray = getPaperTray();
        if (ptray -pages>=0){
            setPaperTray(ptray -pages);
        }else {
            setPaperTray(0);
        }


    }

    private void changeTonerLevel(String color, int pages ) {


        if (color.equalsIgnoreCase("Black")) {
                    setTonerLevelBlack(pages);
        } else if (color.equalsIgnoreCase("Magenta")) {
            setTonerLevelBlack(pages);
        } else if (color.equalsIgnoreCase("Yellow")) {
            setTonerLevelBlack(pages);
        } else if (color.equalsIgnoreCase("Blue")) {
            setTonerLevelBlack(pages);
        }

    }

    private void changePrintedPages(int pages ) {
        setPrintedPages(pages);
    }

    public boolean tonerIsEmpty(){return false;}
    public int getTonerLevel(String toner){return 1;}
}
