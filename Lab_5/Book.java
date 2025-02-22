class Book{
    String name;
    String author;
    boolean isAvailible;

    public Book(String name, String author, boolean isAvailible){
        this.name = name;
        this.author = author;
        this.isAvailible = true;
    }

    public void Borrow_book(){
        if(isAvailible){
            isAvailible = false;
            System.out.println("You have Successfully Borrow "+ name + " Book");
        }
        else{
            System.out.println("Sorry, " + name + " is Already Borrowed by Someone");
        }
    }

    public void  Return_Book(){
        isAvailible = true;
        System.out.println("You have Successfully Returned the "+ name + " Book");
    }

    public  void  Display_Book(){
        System.out.println("Title "  + name);
        System.out.println("Author " + author);
        System.out.println("Availiblity " + isAvailible);
    }
}