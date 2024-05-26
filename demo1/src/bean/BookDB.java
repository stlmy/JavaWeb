package bean;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static Map<String, Book> books = new LinkedHashMap<>();
    static {
        books.put("1", new Book("1", "习近平治国理政",5));
        books.put("2", new Book("2", "铁道游击队",5));
        books.put("3", new Book("3", "毛泽东语录",5));
        books.put("4", new Book("4", "青春之歌",5));
        books.put("5", new Book("5", "星星之火",5));
    }

    //获取所有图书
    public static Collection<Book> getAll() {
        return books.values();
    }

    //根据指定id获取图书
    public static Book getBook(String id) {
        return books.get(id);
    }
}
