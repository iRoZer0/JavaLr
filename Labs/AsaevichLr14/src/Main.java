//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("1 задание");
    String path1 = "city.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path1))) {
        writer.write("Город: Минск");
        writer.newLine();
        writer.write("Страна: Беларусь");
        writer.newLine();
        writer.write("Население: 2 000 000");
        writer.newLine();
        writer.write("Основан: 1067");
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Ошибка записи: " + e.getMessage());
    }

    File file = new File(path1);
    System.out.println("Name: " + file.getName());
    System.out.println("Path: " + file.getAbsolutePath());
    System.out.println("Size: " + file.length());
    System.out.println("Exists: " + file.exists());
    System.out.println("Is file: " + file.isFile());
    System.out.println("Can read: " + file.canRead());
    System.out.println("Can write: " + file.canWrite());
    System.out.println("Last modified: " + file.lastModified());

    try (BufferedReader reader = new BufferedReader(new FileReader(path1))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Ошибка чтения: " + e.getMessage());
    }

    System.out.println("2 задание");
    String path2 = "f.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path2))) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int num = scanner.nextInt();
            writer.write(Integer.toString(num));
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Ошибка записи: " + e.getMessage());
    }

    int max = Integer.MIN_VALUE;
    try (BufferedReader reader = new BufferedReader(new FileReader(path2))) {
        String line;
        while ((line = reader.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            System.out.println(num);
            if (num > max) max = num;
        }
    } catch (IOException e) {
        System.out.println("Ошибка чтения: " + e.getMessage());
    }
    System.out.println("Максимум: " + max);

    System.out.println("3 задание");
    String f3 = "f3.txt";
    String g = "g.txt";
    String h = "h.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(f3))) {
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(201) - 100;
            writer.write(Integer.toString(num));
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Ошибка записи f: " + e.getMessage());
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(f3));
         BufferedWriter writerG = new BufferedWriter(new FileWriter(g));
         BufferedWriter writerH = new BufferedWriter(new FileWriter(h))) {
        String line;
        while ((line = reader.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            if (num > 0) {
                writerG.write(Integer.toString(num));
                writerG.newLine();
            } else if (num < 0) {
                writerH.write(Integer.toString(num));
                writerH.newLine();
            }
        }
    } catch (IOException e) {
        System.out.println("Ошибка обработки: " + e.getMessage());
    }

    System.out.println("Файл g:");
    try (BufferedReader reader = new BufferedReader(new FileReader(g))) {
        String line;
        while ((line = reader.readLine()) != null) System.out.println(line);
    } catch (IOException e) {
        System.out.println("Ошибка чтения g: " + e.getMessage());
    }

    System.out.println("Файл h:");
    try (BufferedReader reader = new BufferedReader(new FileReader(h))) {
        String line;
        while ((line = reader.readLine()) != null) System.out.println(line);
    } catch (IOException e) {
        System.out.println("Ошибка чтения h: " + e.getMessage());
    }

    System.out.println("4 задание");
    String path4 = "pressure.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path4))) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите давление " + (i + 1) + ": ");
            double value = scanner.nextDouble();
            if(value < 0)
            {
                System.out.print("Введите неотриц давление " + (i + 1) + ": ");
                value = scanner.nextDouble();
            }
            writer.write(Double.toString(value));
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Ошибка записи: " + e.getMessage());
    }

    double sum = 0;
    int count = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(path4))) {
        String line;
        while ((line = reader.readLine()) != null) {
            sum += Double.parseDouble(line.trim());
            count++;
        }
    } catch (IOException e) {
        System.out.println("Ошибка чтения: " + e.getMessage());
    }
    if (count > 0) {
        System.out.println("Среднее давление: " + (sum / count));
    } else {
        System.out.println("Нет данных");
    }

    System.out.println("5 задание");
    String path5 = "f5.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path5))) {
        for (int i = 0; i < 10; i++) {
            writer.write(Integer.toString(random.nextInt(100)));
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Ошибка записи: " + e.getMessage());
    }

    int evenCount = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(path5))) {
        String line;
        while ((line = reader.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            System.out.println(num);
            if (num % 2 == 0) evenCount++;
        }
    } catch (IOException e) {
        System.out.println("Ошибка чтения: " + e.getMessage());
    }
    System.out.println("Количество чётных: " + evenCount);
}
