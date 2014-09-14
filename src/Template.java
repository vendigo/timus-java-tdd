import java.io.*;

public class Template {

    static class Solution {
        void solve() throws IOException {
            //Вставте свій розв'язок в цьому методі. Використовуйте readLine, readInt and readDouble для зчитування
            // та writer.print для виведення. Не забудьте викликати writer.flush в кінці.
            writer.flush();
        }

        StreamTokenizer reader;
        PrintWriter writer;

        Solution(StreamTokenizer reader, PrintWriter writer) {
            this.reader = reader;
            this.writer = writer;
        }

        String readLine() throws IOException {
            reader.nextToken();
            return reader.sval;
        }

        int readInt() throws IOException {
            reader.nextToken();
            return (int) reader.nval;
        }

        double readDouble() throws IOException {
            reader.nextToken();
            return (double) reader.nval;
        }
    }

    public static void main(String[] args) throws IOException {
        new Solution(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }
}
