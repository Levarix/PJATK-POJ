public class Main {

    public static void main(String[] args) {
        WordCounter sentence = new WordCounter();
        sentence.openFile();
        sentence.readFile();
        sentence.closeFile();
        sentence.ExecuteAll();
    }
}

