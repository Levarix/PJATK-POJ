public class Main {

    public static void main(String[] args) {
        WordCounter sentence = new WordCounter("This is some sample text. Some text is sampled\n" +
                "for this purpose, but this text is merely a\n" +
                "sample.");
        sentence.ExecuteAll();
    }
}

