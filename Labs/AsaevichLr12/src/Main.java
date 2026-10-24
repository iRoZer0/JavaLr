//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    System.out.println("1 зад");
    Map<String, Vehicle> vehicles = new LinkedHashMap<>();

    vehicles.put("Toyota Camry", new Car("Toyota Camry", 101, 210, 4));
    vehicles.put("BMW M3",       new Car("BMW M3",       102, 250, 2));
    vehicles.put("Kia Rio",      new Car("Kia Rio",      103, 185, 4));

    vehicles.put("Volvo FH",  new Truck("Volvo FH",  201, 120, 20.5));
    vehicles.put("MAN TGX",   new Truck("MAN TGX",   202, 110, 18.0));
    vehicles.put("Scania R",  new Truck("Scania R",  203, 115, 25.0));

    vehicles.put("Harley Davidson", new Motorcycle("Harley Davidson", 301, 180, false));
    vehicles.put("Ural Tourist",    new Motorcycle("Ural Tourist",    302, 130, true));

    for (Map.Entry<String, Vehicle> entry : vehicles.entrySet()) {
        System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
    }

    System.out.println("2 зад");
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, "Ivanov",   "IT",      2, Arrays.asList(5, 4, 5)));
    employees.add(new Employee(2, "Petrov",   "IT",      1, Arrays.asList(2, 1, 3)));
    employees.add(new Employee(3, "Sidorov",  "HR",      3, Arrays.asList(4, 4, 5)));
    employees.add(new Employee(4, "Kuznetsov","Finance", 2, Arrays.asList(3, 3, 3)));
    employees.add(new Employee(5, "Smirnov",  "IT",      1, Arrays.asList(1, 2, 1)));
    employees.add(new Employee(6, "Popov",    "HR",      2, Arrays.asList(5, 5, 4)));
    employees.add(new Employee(7, "Vasiliev", "Finance", 1, Arrays.asList(2, 2, 2)));

    for (Employee e : employees) System.out.println(e);

    EmployeeService.removeLowPerformers(employees);
    for (Employee e : employees) System.out.println(e);

    EmployeeService.promoteHighPerformers(employees);
    for (Employee e : employees) System.out.println(e);

    EmployeeService.printEmployees(employees, 2);

    employees.sort(
            Comparator.comparingDouble(Employee::getAveragePerformance).reversed()
                    .thenComparing(Employee::getName)
    );

    List<Employee> sorted = EmployeeService.sortByPerformanceDescThenName(employees);
    for (Employee e : sorted) {
        System.out.println("ID=" + e.getId() + ", name=" + e.getName() + ", avg=" + e.getAveragePerformance());
    }
  }


