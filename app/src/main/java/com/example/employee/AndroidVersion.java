package com.example.employee;

public class AndroidVersion {

        private String title;
        private double salary;
        private String name;

        public AndroidVersion(String title, double salary, String name) {
            this.title = title;
            this.salary = salary;
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " " + title + "" + salary;
        }
    }

