package patterns;

import java.util.Scanner;

/**
 * A class that demonstrates the factory method pattern
 */
public class FactoryMethod {
    public static void main(String[] args) throws Exception {
        QuotesFactory factory = new QuotesFactory();
        QuotesForLife quotes = factory.createQuote();
        Author author = factory.createAuthor();
        quotes.makeQuote();
        quotes.accept(author);
    }
}

/**
 * A factory class that creates different types of quotes and authors
 */
class QuotesFactory {
    public QuotesForLife createQuote() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of quote you want (Life, Modern, or Funny):");
        String type = sc.next();
        
        switch(type) {
            case "life":
                return new LifeQuote();
            case "modern":
                return new ModernQuote();
            case "funny":
                return new FunnyQuote();
            default:
                throw new Exception("Invalid quote type: " + type);
        }
    }
    
    public Author createAuthor() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the author's language (English or Tamil):");
        String lang = sc.next();
        
        switch(lang) {
            case "english":
                return new EnglishAuthor();
            case "tamil":
                return new TamilAuthor();
            default:
                throw new Exception("Invalid language: " + lang);
        }
    }
}
/**
 * An interface defining the common behavior for different types of quotes
 */
interface QuotesForLife {
    void makeQuote();
    void accept(Author author);
}


/**
 * A class representing life quotes
 */
class LifeQuote implements QuotesForLife {
    @Override
    public void makeQuote() {
        System.out.println("Read for your future, not for your teacher.");
    }
    
    @Override
    public void accept(Author author) {
        System.out.println("This quote was written by " + author.getName() + ".");
    }
}

/**
 * A class representing modern quotes
 */
class ModernQuote implements QuotesForLife {
    @Override
    public void makeQuote() {
        System.out.println("Superstition is out of proportion in this modern world!");
    }
    
    @Override
    public void accept(Author author) {
        System.out.println("This quote was written by " + author.getName() + ".");
    }
}

/**
 * A class representing funny quotes
 */
class FunnyQuote implements QuotesForLife {
    @Override
    public void makeQuote() {
        System.out.println("Why did the chicken cross the road? To get to the other side!");
    }
    
    @Override
    public void accept(Author author) {
        System.out.println("This quote was written by " + author.getName() + ".");
    }
}


/**
 * An interface defining the common behavior for authors
 */
interface Author {
    String getName();
}
/**
 * A class representing an English author
 */
class EnglishAuthor implements Author {
    @Override
    public String getName() {
        return "John Smith";
    }
}

/**
 * A class representing a Tamil author
 */
class TamilAuthor implements Author {
    @Override
    public String getName() {
        return "Pavi";
    }
}
