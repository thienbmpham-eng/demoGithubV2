/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class StringController extends HttpServlet {

    private HashMap<String, Integer> getResult(String str) {
        String[] arr = str.split("[ ,]+");
        HashMap<String, Integer> countWord = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            
            if (!countWord.containsKey(word)) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals(word)) {
                        count++;
                    }
                }
                countWord.put(word, count);
            }
        }
        return countWord;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
            String str = request.getParameter("str");
            
            HashMap<String, Integer> getResult = getResult(str);
            String result = "";
            for(String x : getResult.keySet()){
                if(!result.isEmpty()){
                  result+=", "  ;
                }
                result += x+": " + getResult.get(x) + "lần";
            }
            out.print(result);
            
        } catch (Exception e) {
            e.printStackTrace();
            out.print("The input cannot empty!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
