import supportMethod.ValidatedString;


class University {
    private ValidatedString firstName = new ValidatedString();
    private ValidatedString last_name = new ValidatedString();
    private ValidatedString location = new ValidatedString();
    private double gpa;
    private ValidatedString major = new ValidatedString();
    private ValidatedString specialization = new ValidatedString();


    public University(String first_name, String last_name, String location, double gpa, String major, String specialization){
        this.firstName.setValue(first_name);
        this.last_name.setValue(last_name);
        this.location.setValue(location);
        this.gpa = gpa;
        this.major.setValue(major);
        this.specialization.setValue(specialization);
    }



    // support function
    private boolean isChar(String varible){
        return varible.matches("[A-Za-z]+");
    }
        private boolean isDouble(String number){
        return number.matches("[0-9]+");
    }


    // setter
    public void set_first_name(String first_name){
        if(isChar(first_name)){
            this.first_name = first_name;
        }
        else {
            System.out.println("Invalid first name");
        }
    }


    public void set_last_name(String last_name){
        if(isChar(last_name)){
            this.last_name = last_name;
        }
        else {
            System.out.println("Invalid last name");
        }
    }

    public void set_location(String location){
        if(isChar(location)){
            this.location = location;
        }
        else {
            System.out.println("Invalid location");
        }
    }

    public void set_gpa(String gpa){
        if(isDouble(gpa)){
            this.gpa = Double.parseDouble(gpa);
        }
        else {
            System.out.println("Invalid gpa");
        }
    }

    public void set_major(String major){
        this.major = major;
    }
    public void set_specialization(String specialization){
        this.specialization = specialization;
    }

}