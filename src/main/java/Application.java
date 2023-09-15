import adt.QueueADT;
import adt.QueueADTImpl;

public class Application {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) throws InterruptedException {
        QueueADT<Document> queueADT = new QueueADTImpl<>(10);

        queueADT.enqueue(new Document(1, "Hello world"));
        queueADT.enqueue(new Document(2, "How are you?"));
        queueADT.enqueue(new Document(3, "Welcome to DSA class"));

        // Ý tưởng
        // Dùng enqueue để lấy từng tài liệu
        // In tài liệu , để mô phỏng delay (5-10s) ngẫu nhiên
        // Lấy tài liệu
        int t;
        while (queueADT.size() > 0) {
            Document document = queueADT.dequeue();
            t = getRandomNumber(5, 10) * 1000;
            System.out.println("In tài liệu " + document.getId() + ": ");
            int step = t / 10;

            int k = 0;
            while (k < t) {
                k = k + step;
                System.out.print(k * 100 / t + "% --> ");
                Thread.sleep(step);
            }
            System.out.println();
            System.out.println(document.getContent().toUpperCase());
        }
        System.out.println("In hoàn tất");
    }
}
