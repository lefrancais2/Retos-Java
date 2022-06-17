/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.examples.reto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osgod
 */
public class EmailsProject {

    public static void main(String[] args) {
        runApp();
    }
    
    public static void runApp(){
        Auxiliar aux = new Auxiliar();
        List<Student> listA = aux.getListA();
        List<Student> listB = aux.getListB();
        List<Student> listC = aux.getListC();
        
        List<Student> email_sent = new ArrayList();
        
        //Empezamos por la lista C para el envio de email
        send_email(listC,email_sent,"Malaga");        
        send_email(listA,email_sent,"Malaga");
        send_email(listB,email_sent,"Malaga");
        
        System.out.printf("Verificando emails: %d",email_sent.size());
    }
    
    public static boolean check_student(List<Student> emailStudents,Student student){
        //return emailStudents.contains(student);
        for(Student alumno : emailStudents){
            if(alumno.getName().equals(student.getName())){
                return true;
            }
        }
        return false;
    }
    
    /* 
        En esta funcion se crea el email y se envia a los estudiantes
    */
    public static boolean createEmail(Student student){
        return true;
    }
    
    public static void send_email(List<Student> lista,List<Student> email_sent,String campus){
        for(Student student : lista){
            //Si la funcion check_student devuelve true, es porque ya se envió email al estudiante
            if(!check_student(email_sent,student) && student.getCampus().equals(campus)){
                createEmail(student);
                email_sent.add(student);
            }
        }
    }
    
    
}
