public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new Singleton();    //создаём новый объект
            System.out.println("Singleton just created!");
        }
        else{
            System.out.println("Singleton already created");
        }
        return instance;        // возвращаем созданный (только что или когда-то ранее) объект
    }
}
