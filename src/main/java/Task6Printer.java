/*"6. Create a class and demonstrate proper encapsulation techniques
        the class will be called Printer
        It will simulate a real Computer printer
        It should have fields for toner level, number of pages printed, and also
        whether its a duplex printer (capable of printing on both sides of the paper).
        Add methods to fill up the toner (up to a maximum of 100%), another method to
        simulate printing a page(which should increase the number of pages printed).
        Decide on the scope, whether to use constructors, and anything else you think is needed."
        //========================================================================================//
        Tips
        "Example of fields:
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
Example of methods:
fillUp(int tonerVolume, String color);
print(int pages, String color, boolean isDuplex);
tonerIsEmpty();
getTonerLevel(String toner);
etc." */

public class Task6Printer {
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

    public Task6Printer(String manufacturer, String model, boolean isColor,
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

    private void setPaperTray(int pages ) {

        this.paperTray =   pages;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    private void setTonerLevelBlack(int pages) {
        this.tonerLevelBlack += pages;
    }

    public int getTonerLevelMagenta() {
        return tonerLevelMagenta;
    }

    private void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta += tonerLevelMagenta;
    }

    public int getTonerLevelYellow() {
        return tonerLevelYellow;
    }

    private void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow += tonerLevelYellow;
    }

    public int getTonerLevelBlue() {
        return tonerLevelBlue;
    }

    private void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue += tonerLevelBlue;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    private void setPrintedPages(int printedPages) {
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
        Task6Printer Samsung= new Task6Printer("Samsung", "S00001", true, "Lazer", true,
                80, 60,40,40,0);
        Samsung.setPaperTray(100);
        Samsung.print(51, "Yellow", true);
        Samsung.fillUp(100,"Blue");
        System.out.println(Samsung.toString());
    }

    public void print(int pages, String color, boolean isDuplex){
        int tmpPrintedPages =changePrintedPages(pages,color);
        changeTonerLevel(color,pages);
        changePaperTray(tmpPrintedPages,isDuplex);



        if( !tonerIsEmpty("Blue")){
            System.out.println("Toner is not empty ");
        }

        System.out.println("Printed "+ pages+ " pages, "+ " color is "+ color+ ", isDuplex "+ isDuplex);
    }

    public void changePaperTray(int pages, boolean isDuplex) {

        if (isDuplex) {
            if (pages % 2 == 0) {
                pages = pages / 2;
            } else {
                int tail= pages%2;
                pages = pages/2+ tail; // значит половина плюс остаток, то есть 1
            }
        }
        int ptray = getPaperTray();
        if (ptray -pages>=0){
            setPaperTray(ptray -pages);
        }else {
            setPaperTray(0);
        }
    }

    public void changeTonerLevel(String color, int pages ) {
        int tonLevel = getTonerLevel(color);
        if (color.equalsIgnoreCase("Black")) {
            if (tonLevel<pages) {
                pages = tonLevel;

            }
            setTonerLevelBlack(-pages);
        } else if (color.equalsIgnoreCase("Magenta")) {
            if (tonLevel<pages) {
                pages = tonLevel;

            }
            setTonerLevelMagenta(-pages);
        } else if (color.equalsIgnoreCase("Yellow")) {
            if (tonLevel<pages) {
                pages = tonLevel;

            }
            setTonerLevelYellow(-pages);
        } else if (color.equalsIgnoreCase("Blue")) {
            if (tonLevel<pages) {
                pages = tonLevel;
            }
            setTonerLevelBlue(-pages);
        }
    }

    public int changePrintedPages(int pages, String color ) {
        int toner  = getTonerLevel(color); //50
        int pTray = getPaperTray(); //100
        if (toner >= pages & pTray >= pages) {
            setPrintedPages(pages);
            return pages;
        } else {
            if (pTray < pages)  pages = pTray;
            if (toner < pages)  pages = toner;
            setPrintedPages(pages);
            return  pages;
        }
    }

    public int getTonerLevel(String toner){
        if (toner.equalsIgnoreCase("Black")) {
            return getTonerLevelBlack();
        } else if (toner.equalsIgnoreCase("Magenta")) {
            return getTonerLevelMagenta();
        } else if (toner.equalsIgnoreCase("Yellow")) {
            return getTonerLevelYellow();
        } else if (toner.equalsIgnoreCase("Blue")) {
            return getTonerLevelBlue();
        }
        return 1;
    }
    public void fillUp(int tonerVolume, String color){
        int tonLevel = getTonerLevel(color);
        if ((tonLevel + tonerVolume) > 100) {
            tonerVolume = 100 - tonLevel;
        }
        if (color.equalsIgnoreCase("Black")) {
            setTonerLevelBlack(tonerVolume);
        } else if (color.equalsIgnoreCase("Magenta")) {
            setTonerLevelMagenta(tonerVolume);
        } else if (color.equalsIgnoreCase("Yellow")) {
            setTonerLevelYellow(tonerVolume);
        } else if (color.equalsIgnoreCase("Blue")) {
            setTonerLevelBlue(tonerVolume);
        }

    }
    public boolean tonerIsEmpty(String toner){
        int tonLevel = getTonerLevel(toner);
        return  tonLevel==0;
    }
}
