package ok.object.oriented;

public class Book {
    private String title, author, year;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getYear() {
        return year;
    }

    public String toString() {
        System.out.println("Название " + getTitle() + "\nАвтор " + getAuthor()
                + "\nГод " + getYear());
        return ("Название " + getTitle() + "\nАвтор " + getAuthor()
                + "\nГод " + getYear());
    }
}

class Author {
    private String name, sex, email;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        System.out.println("Автор " + getName() + "\nПол " + getSex()
                + "\nEmail " + getEmail());
        return ("Автор " + getName() + "\nПол " + getSex()
                + "\nEmail " + getEmail());
    }
}

class Main4 {
    public static void main(String[] arg) {
        Author test1 = new Author();
        test1.setName("Кип Торн");
        test1.setSex("Мужской");
        test1.setEmail("Неизвестен");
        test1.toString();

        System.out.println();   // Пустая строка

        Book test2 = new Book();
        test2.setTitle("Интерстеллар. Наука за кадром");
        test2.setAuthor(test1.getName());
        test2.setYear("2014");
        test2.toString();
    }
}