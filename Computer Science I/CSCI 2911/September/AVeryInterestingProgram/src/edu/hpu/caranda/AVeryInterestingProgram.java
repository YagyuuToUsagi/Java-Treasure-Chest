package edu.hpu.caranda;

import java.util.Scanner;

public class AVeryInterestingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word;
        int count;

        System.out.println("Welcome to Character Counter . I take words and phrases!");
        System.out.println("Type in a word/phrase that has 30 characters only.");
        System.out.print("Type in a word/phrase to know some epic information! :");
        word = input.nextLine();
        System.out.print("\n");

        count = word.length();

        int more = 0;
        while (word.length() > 30) {
            System.out.println("Bruh, that's more than 30 characters.");
            System.out.print("TRY AGAIN!");
            word = input.nextLine();
            ++more;
        }

        int a_count=0, b_count=0, c_count=0;
        int d_count=0, e_count=0, f_count=0;
        int g_count=0, h_count=0, i_count=0;
        int j_count=0, k_count=0, l_count=0;
        int m_count=0, n_count=0, o_count=0;
        int p_count=0, q_count=0, r_count=0;
        int s_count=0, t_count=0, u_count=0;
        int v_count=0, w_count=0, x_count=0;
        int y_count=0, z_count=0, space_count=0;
        
        
        boolean has_a = false, has_b=false, has_c=false;
        boolean has_d = false, has_e=false, has_f=false;
        boolean has_g = false, has_h=false, has_i=false;
        boolean has_j = false, has_k=false, has_l=false;
        boolean has_m = false, has_n=false, has_o=false;
        boolean has_p = false, has_q=false, has_r=false;
        boolean has_s = false, has_t=false, has_u=false;
        boolean has_v = false, has_w=false, has_x=false;
        boolean has_y = false, has_z=false, has_space=false;

        
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                has_a = true;                
                ++a_count;
            }
            if (word.charAt(i) == 'b' || word.charAt(i) == 'B') {
                has_b = true;
                ++b_count;               
            }
            if (word.charAt(i) == 'c' || word.charAt(i) == 'C') {
                has_c = true;
                ++c_count;               
            }
            if (word.charAt(i) == 'd' || word.charAt(i) == 'D') {
                has_d = true;
                ++d_count;               
            }
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E') {
                has_e = true;
                ++e_count;               
            }
            if (word.charAt(i) == 'f' || word.charAt(i) == 'F') {
                has_f = true;
                ++f_count;               
            }
            if (word.charAt(i) == 'g' || word.charAt(i) == 'G') {
                has_g = true;
                ++g_count;               
            }
            if (word.charAt(i) == 'h' || word.charAt(i) == 'H') {
                has_h = true;
                ++h_count;
            }
            if (word.charAt(i) == 'i' || word.charAt(i) == 'I') {
                has_i = true;
                ++i_count;               
            }
            if (word.charAt(i) == 'j' || word.charAt(i) == 'J') {
                has_j = true;
                ++j_count;               
            }
            if (word.charAt(i) == 'k' || word.charAt(i) == 'K') {
                has_k = true;
                ++k_count;               
            }
            if (word.charAt(i) == 'l' || word.charAt(i) == 'L') {
                has_l = true;
                ++l_count;               
            }
            if (word.charAt(i) == 'm' || word.charAt(i) == 'M') {
                has_m = true;
                ++m_count;               
            }
            if (word.charAt(i) == 'n' || word.charAt(i) == 'N') {
                has_n = true;
                ++n_count;               
            }
            if (word.charAt(i) == 'o' || word.charAt(i) == 'O') {
                has_o = true;
                ++o_count;               
            }
            if (word.charAt(i) == 'p' || word.charAt(i) == 'P') {
                has_p = true;
                ++p_count;               
            }
            if (word.charAt(i) == 'q' || word.charAt(i) == 'Q') {
                has_q = true;
                ++q_count;               
            }
            if (word.charAt(i) == 'r' || word.charAt(i) == 'R') {
                has_r = true;
                ++r_count;
            }
            if (word.charAt(i) == 's' || word.charAt(i) == 'S') {
                has_s = true;
                ++s_count;               
            }
            if (word.charAt(i) == 't' || word.charAt(i) == 'T') {
                has_t = true;
                ++t_count;               
            }
            if (word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                has_u = true;
                ++u_count;               
            }
            if (word.charAt(i) == 'v' || word.charAt(i) == 'V') {
                has_v = true;
                ++v_count;               
            }
            if (word.charAt(i) == 'w' || word.charAt(i) == 'W') {
                has_w = true;
                ++w_count;               
            }
            if (word.charAt(i) == 'x' || word.charAt(i) == 'X') {
                has_x = true;
                ++x_count;               
            }
            if (word.charAt(i) == 'y' || word.charAt(i) == 'Y') {
                has_y = true;
                ++y_count;               
            }
            if (word.charAt(i) == 'z' || word.charAt(i) == 'Z') {
                has_z = true;
                ++z_count;               
            }
            if (word.charAt(i) == ' ') {
                has_space = true;
                ++space_count;               
            }

        }
        
        System.out.println("Here's the information you need to know: \nThe word/phrase contains "+space_count+" space(s)\n");
        System.out.println("It also contains: "+a_count+" 'a' character(s), "+b_count+" 'b' character(s),");
        System.out.println(c_count+" 'c' character(s), "+d_count+" 'd' character(s),");
        System.out.println(+e_count+" 'e' character(s), "+f_count+" 'f' character(s),");
        System.out.println(+g_count+" 'g' character(s), "+h_count+" 'h' character(s),");
        System.out.println(+i_count+" 'i' character(s), "+j_count+" 'j' character(s),");
        System.out.println(+k_count+" 'k' character(s), "+l_count+" 'l' character(s),");
        System.out.println(+m_count+" 'm' character(s), "+n_count+" 'n' character(s),");
        System.out.println(+o_count+" 'o' character(s), "+p_count+" 'p' character(s),");
        System.out.println(+q_count+" 'q' character(s), "+r_count+" 'r' character(s),");
        System.out.println(+s_count+" 's' character(s), "+t_count+" 't' character(s),");
        System.out.println(+u_count+" 'u' character(s), "+v_count+" 'v' character(s),");
        System.out.println(+w_count+" 'w' character(s), "+x_count+" 'x' character(s),");
        System.out.println(+y_count+" 'y' character(s) and "+z_count+" 'z' character(s).\n\n");
        
        System.out.println("The word/phrase has " + count + " characters in total (including spaces).");
        System.out.println("Thanks for using the program, have an awesome day!");

    }
}
