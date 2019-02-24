package com.example.icare;

public class Product{
        private int id;
        private String diary;


        public Product(int id, String diary) {
            this.id = id;
            this.diary = diary;

        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return diary;
        }


}
