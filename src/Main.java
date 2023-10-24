import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:/Games/src");
        File dir1 = new File("C:/Games/res");
        File dir2 = new File("C:/Games/savegames");
        File dir3 = new File("C:/Games/temp");
        File dir4 = new File(dir,"main");
        File dir5 = new File(dir,"test");
        File dir6 = new File(dir4,"Main.java");
        File dir7 = new File(dir4,"Utils.java");
        File dir8 = new File(dir1,"drawbeles");
        File dir9 = new File(dir1,"vectors");
        File dir10 = new File(dir1,"icons");
        File dir11 = new File(dir3,"temp.txt");
        try {
            if (dir.mkdir()) {

                if (dir1.mkdir()) {
                    if (dir2.mkdir()) {
                        if (dir3.mkdir()) {
                            if (dir4.mkdir()) {
                                if (dir5.mkdir()) {
                                    if (dir6.createNewFile()) {
                                        if (dir7.createNewFile()) {
                                            if (dir8.mkdir()) {
                                                if (dir9.mkdir()) {
                                                    if (dir10.mkdir()) {

                                                        if (dir11.createNewFile()) {
                                                            FileWriter  writer = new FileWriter(dir11, true);
                                                            writer.write("Все операции были проведены успешно.");
                                                            writer.close();
                                                        } else {
                                                        }
                                                    } else {
                                                    }
                                                } else {
                                                }
                                            } else {
                                            }
                                        } else {
                                        }
                                    } else {
                                    }
                                } else {
                                }
                            }
                        } else {
                        }
                    } else {
                    }
                } else {
                }
            } else {
                System.out.println("Что-то пошло не так.");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}