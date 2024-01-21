// class room 10th

//12th class room - cpoll of student


//stu - id name subj-math

//class wise 10th stu count of secure 100 of marks in math

//class wise 12th stu count of secure 100 of marks in math

//School 
// 10th & 12th

package com.rathod.assignments.faq;

// interface citiTest {

//     public abstract void getMarks();
// }

//import java.util.List;


public class TenStudent { //implements citiTest {

    @Override
    public void getMarks() {
        // TODO Auto-generated method stub
        //fetch the marks of student

        throw new UnsupportedOperationException("Unimplemented method 'getMarks'");
    }

    // @Override
    // public String toString() {
    //     return "TenStudent []";
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     // TODO Auto-generated method stub
    //     return super.equals(obj);
    // }

    public static void main(String[] args) {

        List<Student> stu = new ArrayList<>();
        
    }


}


// public class TwelthStudent implements citiTest {

//     @Override
//     public void getMarks() {
//         // TODO Auto-generated method stub

//         throw new UnsupportedOperationException("Unimplemented method 'getMarks'");
//     }

//     @Override
//     public String toString() {
//         return "TenStudent []";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         // TODO Auto-generated method stub
//         return super.equals(obj);
//     }


// }



class Student {

    int id ;
    String name;
    String sunject;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSunject() {
        return sunject;
    }
    public void setSunject(String sunject) {
        this.sunject = sunject;
    }
    
} 
