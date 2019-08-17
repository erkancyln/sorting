/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import static tictactoe.TicTacToe.ebat;

/**
 *
 * @author Ümit
 */
public class TicTacToe {
    
    public static int ebat;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
System.out.println("      _____                    _____                    _____                        _____                    _____                    _____                        _____                   _______                   _____");          
System.out.println("     /\\    \\                  /\\    \\                  /\\    \\                      /\\    \\                  /\\    \\                  /\\    \\                      /\\    \\                 /::\\    \\                 /\\    \\         ");
System.out.println("    /::\\    \\                /::\\    \\                /::\\    \\                    /::\\    \\                /::\\    \\                /::\\    \\                    /::\\    \\               /::::\\    \\               /::\\    \\        ");
System.out.println("    \\:::\\    \\               \\:::\\    \\              /::::\\    \\                   \\:::\\    \\              /::::\\    \\              /::::\\    \\                   \\:::\\    \\             /::::::\\    \\             /::::\\    \\       ");
System.out.println("     \\:::\\    \\               \\:::\\    \\            /::::::\\    \\                   \\:::\\    \\            /::::::\\    \\            /::::::\\    \\                   \\:::\\    \\           /::::::::\\    \\           /::::::\\    \\      ");
System.out.println("      \\:::\\    \\               \\:::\\    \\          /:::/\\:::\\    \\                   \\:::\\    \\          /:::/\\:::\\    \\          /:::/\\:::\\    \\                   \\:::\\    \\         /:::/~~\\:::\\    \\         /:::/\\:::\\    \\     ");
System.out.println("       \\:::\\    \\               \\:::\\    \\        /:::/  \\:::\\    \\                   \\:::\\    \\        /:::/__\\:::\\    \\        /:::/  \\:::\\    \\                   \\:::\\    \\       /:::/    \\:::\\    \\       /:::/__\\:::\\    \\    ");
System.out.println("       /::::\\    \\              /::::\\    \\      /:::/    \\:::\\    \\                  /::::\\    \\      /::::\\   \\:::\\    \\      /:::/    \\:::\\    \\                  /::::\\    \\     /:::/    / \\:::\\    \\     /::::\\   \\:::\\    \\   ");
System.out.println("      /::::::\\    \\    ____    /::::::\\    \\    /:::/    / \\:::\\    \\                /::::::\\    \\    /::::::\\   \\:::\\    \\    /:::/    / \\:::\\    \\                /::::::\\    \\   /:::/____/   \\:::\\____\\   /::::::\\   \\:::\\    \\  ");
System.out.println("     /:::/\\:::\\    \\  /\\   \\  /:::/\\:::\\    \\  /:::/    /   \\:::\\    \\              /:::/\\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/    /   \\:::\\    \\              /:::/\\:::\\    \\ |:::|    |     |:::|    | /:::/\\:::\\   \\:::\\    \\ ");
System.out.println("    /:::/  \\:::\\____\\/::\\   \\/:::/  \\:::\\____\\/:::/____/     \\:::\\____\\            /:::/  \\:::\\____\\/:::/  \\:::\\   \\:::\\____\\/:::/____/     \\:::\\____\\            /:::/  \\:::\\____\\|:::|____|     |:::|    |/:::/__\\:::\\   \\:::\\____\\");
System.out.println("   /:::/    \\::/    /\\:::\\  /:::/    \\::/    /\\:::\\    \\      \\::/    /           /:::/    \\::/    /\\::/    \\:::\\  /:::/    /\\:::\\    \\      \\::/    /           /:::/    \\::/    / \\:::\\    \\   /:::/    / \\:::\\   \\:::\\   \\::/    /");
System.out.println("  /:::/    / \\/____/  \\:::\\/:::/    / \\/____/  \\:::\\    \\      \\/____/           /:::/    / \\/____/  \\/____/ \\:::\\/:::/    /  \\:::\\    \\      \\/____/           /:::/    / \\/____/   \\:::\\    \\ /:::/    /   \\:::\\   \\:::\\   \\/____/ ");
System.out.println(" /:::/    /            \\::::::/    /            \\:::\\    \\                      /:::/    /                    \\::::::/    /    \\:::\\    \\                      /:::/    /             \\:::\\    /:::/    /     \\:::\\   \\:::\\    \\     ");
System.out.println("/:::/    /              \\::::/____/              \\:::\\    \\                    /:::/    /                      \\::::/    /      \\:::\\    \\                    /:::/    /               \\:::\\__/:::/    /       \\:::\\   \\:::\\____\\    ");
System.out.println("\\::/    /                \\:::\\    \\               \\:::\\    \\                   \\::/    /                       /:::/    /        \\:::\\    \\                   \\::/    /                 \\::::::::/    /         \\:::\\   \\::/    /    ");
System.out.println(" \\/____/                  \\:::\\    \\               \\:::\\    \\                   \\/____/                       /:::/    /          \\:::\\    \\                   \\/____/                   \\::::::/    /           \\:::\\   \\/____/     ");
System.out.println("                           \\:::\\    \\               \\:::\\    \\                                               /:::/    /            \\:::\\    \\                                             \\::::/    /             \\:::\\    \\         ");
System.out.println("                            \\:::\\____\\               \\:::\\____\\                                             /:::/    /              \\:::\\____\\                                             \\::/____/               \\:::\\____\\        ");
System.out.println("                             \\::/    /                \\::/    /                                             \\::/    /                \\::/    /                                              ~~                      \\::/    /        ");
System.out.println("                              \\/____/                  \\/____/                                               \\/____/                  \\/____/                                                                        \\/____/         ");
                                                                                                                                                                                                                                     

        File savedosya = new File("save.txt");
        if(savedosya.exists())
        {
            
            System.out.println("Kayıtlı Oyunu Açmak İçin (k),Yeni Oyun için (y) yazın...");
            Scanner s = new Scanner(System.in);
            boolean state = false;
            do{
            String oku = s.nextLine();
            if(oku.equals("k"))
            {
             state =true;
             
             FileReader fileReader = new FileReader("save.txt");
            String line;

            BufferedReader br = new BufferedReader(fileReader);
            
            int i =0;
            String veri_data="";
            String veri_ebat = "";
            String veri_insankim="";
            String veri_sira="";
            while ((line = br.readLine()) != null) {

                if(i==0)
                {
                veri_data = line;
                }
                else if (i==1)
                {
                veri_ebat = line;
                }
                else if (i==2)
                {
                veri_insankim = line;
                }
                else if (i==3)
                {
                veri_sira = line;
                break;
                }
                i++;
            }
            br.close();
            int gecici_ebat = Integer.parseInt(veri_ebat);
            veri_insankim = veri_insankim.toUpperCase();
            veri_sira = veri_sira.toUpperCase();
            char gecici_sira = veri_sira.charAt(0);
            char[][] gecici_tahta = new char[gecici_ebat][gecici_ebat];
            int a=0;
            for(i=0;i<gecici_ebat;i++)
            {
                for(int j=0;j<gecici_ebat;j++)
                {
                    gecici_tahta[i][j] = veri_data.charAt(a);
                    a++;
                }
            }
            
            loadgame(gecici_tahta,veri_insankim,gecici_ebat,gecici_sira);
            
            }
            else if (oku.equals("y"))
            {
            state = true;
            ndng();
            
            }
            }
            while(state == false);
            
        }
        else
        {
           ndng();
             
        }
            
        
        }
   
     public static void loadgame(char oyuntahta[][],String oyuncuharf,int tahtaebat,char Hamlesirasi) throws IOException
    {
               ebat = tahtaebat;
        
               char harf = oyuncuharf.charAt(0);
               char otherharf;
           
           oyunTahtasi gameboard = new oyunTahtasi(oyuntahta);
         
           oyuncu playerinsan = new oyuncu(true,harf);

            if(harf !='N')
           {

                if(harf=='X')
                {
                    otherharf = 'O';
                }
                else
                {
                    otherharf = 'X';
               
                        
                }
           
            }
            else
            {
             otherharf = 'O';
            }
          
           oyuncu playercomputer = new oyuncu(false,otherharf);
          
           String hamle;
           gameboard.oyunTahtasiniYazdir();


           while(true)
           {
             
             char mark1 = playerinsan.karakteriAl();
             char mark2 = playercomputer.karakteriAl();
             
             
             if(Hamlesirasi == mark1)
             {
             //insan hamle sırası
            
             
             boolean durum = false;
             
               do
             {   
              hamle = playerinsan.insanOyuncuHamlesiniKotrol();
              if(hamle.equals("q"))
              {
                  System.out.println("Oyunu Kaydetmek İster Misiniz (E/H)");
                  Scanner vegeta = new Scanner(System.in);
                  String cevap = vegeta.nextLine();
                 cevap = cevap.toUpperCase();
                  if(cevap.equals("E"))
                  {
                        gameboard.kaydet(mark1,Hamlesirasi);
                      
                      System.exit(0);
                      
                  }
                  else
                  {
                      System.exit(0);
                  }

                          
              }
              durum = gameboard.hamleyiYaz(hamle, mark1);
             
             if(durum==true)
             {
                 System.out.println("Hamlenizi Yaptınız");
             }
             else
             {
                 System.out.println("Hata ! Tekrar dene");
                 durum = false;
             }
             
             }while(durum==false);
             
             
             
              gameboard.oyunTahtasiniYazdir();
            
             }
             else
             {
                 
                 
             boolean durum = false;
             
             do
             {  
             //bilgisayar hamle sırası
             hamle = playercomputer.bilgisayarHamlesiUret();
             durum = gameboard.hamleyiYaz(hamle,mark2);
            
             if(durum==true)
             {
                 System.out.println("Bilgisayar Hamle Yaptı");
                
             }
             else
             {
                   durum = false;
             }
             
             
             }while(durum==false);
             
             
             gameboard.oyunTahtasiniYazdir();
             }
             //
             if(gameboard.kazanan(Hamlesirasi)== true)
             {
                     //bir kazanan var
                    if(Hamlesirasi == mark1)
                    {
                        System.out.println("İnsan Kazandı");
                        break;
                    }
                    else
                    {
                        System.out.println("Rastgele Oynayan Bilgisayar Kazandı");
                         break;
                    }
             }
             else
             {
             
            
             if(gameboard.beraberlikKontrol() == false)
             {
                 System.out.println("Oyun Berabere!");
                 break;
                
             }   
             
             }
             
             
             if(Hamlesirasi == 'X')
             {
                 Hamlesirasi = 'O';
             }
             else
             {
                 Hamlesirasi = 'X';
             }
             
             
               
           }
      
           //X,O boş ise   
    }
   
     
    public static void ndng() throws IOException
    {
      ebat = oyuncu_tahtasi_boyut_al();
           String oyuncuharf = oyuncu_harf_al();
               char harf = oyuncuharf.charAt(0);
               char otherharf;
           
           oyunTahtasi gameboard = new oyunTahtasi(ebat);
         
           oyuncu playerinsan = new oyuncu(true,harf);
          
        
        
            if(harf !='N')
           {
               
             
                if(harf=='X')
                {
                    otherharf = 'O';
                }
                else
                {
                    otherharf = 'X';
               
                        
                }
           
            }
            else
            {
             otherharf = 'O';
            }
          
           oyuncu playercomputer = new oyuncu(false,otherharf);
          
          
          
          
             
          //  Runtime.getRuntime().exec("cls");
            System.out.println("Oyun Başladı:");
           
           char Hamlesirasi = 'X';
           String hamle;
           gameboard.oyunTahtasiniYazdir();


           while(true)
           {
             
             char mark1 = playerinsan.karakteriAl();
             char mark2 = playercomputer.karakteriAl();
             
             
             if(Hamlesirasi == mark1)
             {
             //insan hamle sırası
            
             
             boolean durum = false;
             
            do
             {   
              hamle = playerinsan.insanOyuncuHamlesiniKotrol();
              if(hamle.equals("q"))
              {
                  System.out.println("Oyunu Kaydetmek İster Misiniz (E/H)");
                  Scanner vegeta = new Scanner(System.in);
                  String cevap = vegeta.nextLine();
                 cevap = cevap.toUpperCase();
                  if(cevap.equals("E"))
                  {
                        gameboard.kaydet(mark1,Hamlesirasi);
                      
                      System.exit(0);
                      
                  }
                  else
                  {
                      System.exit(0);
                  }

                          
              }
              durum = gameboard.hamleyiYaz(hamle, mark1);
             
             if(durum==true)
             {
                 System.out.println("Hamlenizi Yaptınız");
             }
             else
             {
                 System.out.println("Hata ! Tekrar dene");
                 durum = false;
             }
             
             }while(durum==false);
             
             
             
              gameboard.oyunTahtasiniYazdir();
            
             }
             else
             {
                 
                 
             boolean durum = false;
             
             do
             {  
             //bilgisayar hamle sırası
             hamle = playercomputer.bilgisayarHamlesiUret();
             durum = gameboard.hamleyiYaz(hamle,mark2);
            
             if(durum==true)
             {
                 System.out.println("Bilgisayar Hamle Yaptı");
                
             }
             else
             {
                   durum = false;
             }
             
             
             }while(durum==false);
             
             
             gameboard.oyunTahtasiniYazdir();
             }
             //
             if(gameboard.kazanan(Hamlesirasi)== true)
             {
                     //bir kazanan var
                    if(Hamlesirasi == mark1)
                    {
                        System.out.println("İnsan Kazandı");
                        break;
                    }
                    else
                    {
                        System.out.println("Rastgele Oynayan Bilgisayar Kazandı");
                         break;
                    }
             }
             else
             {
             
            
             if(gameboard.beraberlikKontrol() == false)
             {
                 System.out.println("Oyun Berabere!");
                 break;
                
             }   
             
             }
             
             
             if(Hamlesirasi == 'X')
             {
                 Hamlesirasi = 'O';
             }
             else
             {
                 Hamlesirasi = 'X';
             }
             
             
               
           }
      
           //X,O boş ise   
    }
   
    
    public static void ekrantemizle(){
   
        System.out.println("\033[H\033[2J");
        System.out.flush();
    
    }
    
    public static int oyuncu_tahtasi_boyut_al()
        {
            Scanner s = new Scanner(System.in);
            int sayi;         
            while(true)
            {
                System.out.println("Lütfen Oyun Tahtasının Boyutunu Girin\n3,5,7");
                sayi = s.nextInt();
                if(sayi==3)
                {
                return 3;
                }
                else if (sayi==5)
                {
                return 5;
                }
                else if (sayi==7)
                {
                return 7;
                }
                else
                {
                    System.out.println("Lütfen geçerli bir boyut girin");
                }
                
            }
          
            
            
        }
        
    public static String oyuncu_harf_al()
        {
             Scanner s = new Scanner(System.in);
             String oku;
            
            System.out.println("Lütfen Harfinizi Seçin (x|o)");
            oku = s.nextLine();
             if(oku.equals("x"))
            {
                return "X";
              
            }
            else if (oku.equals("o"))
            {
                 return "O";
            }
            else
            {
                return "N";
            }

            
        }

    }
    class oyunTahtasi
    {
        char[][] tahta;
        int boyut;
        public oyunTahtasi(int b)
        {
           this.tahta= new char[b][b];
           this.boyut = b;
          
           for(int i=0;i<b;i++)
           {
               for(int j=0;j<b;j++)
               {
                   tahta[i][j] = 'N';
               }
           }
        }
        public oyunTahtasi(char [][] board)
        {
            tahta = board;
            boyut = board.length;
        }
        public char [][] oyunTahtasiniAl()
        {
            return tahta;
        }
        void oyunTahtasiniYazdir()
        {
            if(boyut==3)
            {
                System.out.println("\tA\tB\tC");
               
            }
            else if (boyut ==5)
            {
              System.out.println("\tA\tB\tC\tD\tE");
            
            }
            else if (boyut ==7)
            {
              System.out.println("\tA\tB\tC\tD\tE\tF\tG");
            
            }
            System.out.println("\n");
            for(int i=0;i<boyut;i++)
            {
               
                System.out.print(i+"\t");
                for(int j=0;j<boyut;j++)
                {
                    if(tahta[i][j]=='N')
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                          System.out.print(tahta[i][j]);
                    }
              
                  
                    System.out.print("\t");
                }
                System.out.print("\n\n\n");
                
            }
        }
        
        void kaydet(char insankim,char hamlesirasi) throws IOException
        {
                      String str="";
                      for(int i=0;i<ebat;i++)
                      {
                          for(int j=0;j<ebat;j++)
                          {
                              str = str + tahta[i][j];
                          }
                      }
                      str = str + "\n"+ebat;
                      str = str + "\n"+insankim;
                      str = str + "\n"+hamlesirasi;
                      // gameboard.kaydet(insankim,hamlesirasi);
                      //kaydet çık
                      //ilk satır:tüm değerler yan yana
                      //ikinci satır: boyut
                      //üçüncü satır: insan kim
                      //dördüncü satır: sıra kimde
                       File file = new File("save.txt");
                  if (!file.exists()) {
                          file.createNewFile();
                     }

                        FileWriter fileWriter = new FileWriter(file, false);
                        BufferedWriter bWriter = new BufferedWriter(fileWriter);
                        bWriter.write(str);
                        bWriter.close();
                  
        }
        
        //1A gibi koordinat alır. harfi alır. harfi müsaitse yazar
        boolean hamleyiYaz(String koordinat, char oyuncu)
        {
              //  durum = gameboard.hamleyiYaz(hamle, mark1);
            //B1 C2 GİBİ GİBİ
            oyuncu =  Character.toUpperCase(oyuncu);
            
          
          int x;
          if(koordinat.charAt(0) =='A')
          {
              x = 0;
          }
          else if( koordinat.charAt(0) =='B')
          {
              x = 1;
          }
           else if( koordinat.charAt(0) =='C')
          {
              x = 2;
          }
            else if( koordinat.charAt(0) ==('D'))
          {
              x = 3;
          }
           else if( koordinat.charAt(0) =='E')
          {
              x = 4;
          }
           else if( koordinat.charAt(0) =='F')
          {
              x = 5; 
          }
           else if( koordinat.charAt(0) =='G')
          {
              x = 6; 
          }
          else
          {
          return false;
          }     
          if(x+1 > boyut)
           {
            return false;
           }
          
            int y =  Character.getNumericValue(koordinat.charAt(1));
            if(y+1 > boyut)
            {
            return false;
            }
            
              if (tahta[y][x] == 'N')
              {
              tahta[y][x] = oyuncu;
              return true;
              }
              else
              {
              return false;
              }
          
          
        }
          boolean hamleyiKontrolet(String koordinat, char oyuncu)
        {
              
            oyuncu =  Character.toUpperCase(oyuncu);
            if(oyuncu == 'X'&& oyuncu == 'O')
            {
              
                
        
            }
            else
            {
            return false;
            
                    
            }    
                
            int y =  Character.getNumericValue(koordinat.charAt(0));
            if(y > boyut)
            {
            return false;
            }
          int x=0;
          if(koordinat.charAt(1) =='A')
          {
              x = 0;
              
              
          }
          else if( koordinat.charAt(1) =='B')
          {
              x = 1;
             
             
          }
           else if( koordinat.charAt(1) =='C')
          {
              x = 2;
                 
                 
              
          }
            else if( koordinat.charAt(1) ==('D'))
          {
              x = 3;
            
            
          
          
          
          }
           else if( koordinat.charAt(1) =='E')
          {
              x = 4;
              
              
              
              
              
          }
           else if( koordinat.charAt(1) =='F')
          {
              x = 5;
              
              
              
             
              
              
              
              
          }
           else if( koordinat.charAt(1) =='G')
          {
              x = 6;
              
              
              
              
          }
          else
          {
          return false;
          }     
       
              if (tahta[x][y] == 'N')
              {
             
              return true;
              }
              else
              {
              return false;
              }
          
          
        }
        
        
       //x ya da o yı alır. x mi o mu kazandı kontrol eder.
       //  if(gameboard.kazanan(Hamlesirasi)== true)
        boolean kazanan(char xoro)
        {
            char put;
           
            put = Character.toUpperCase(xoro);
        
               
           
            for(int i=0;i<boyut;i++)
            {
                for(int j=0;j<boyut;j++)
                {
                    try
                    {
                    if(tahta[i-1][j] == put && tahta[i][j] == put && tahta[i+1][j]==put)   
                    {
                        return true;
                    }
                    else  if(tahta[i-1][j-1] == put && tahta[i][j] == put && tahta[i+1][j+1]==put)   
                    {
                        return true;
                    }
                    else  if(tahta[i][j-1] == put && tahta[i][j] == put && tahta[i][j+1]==put)   
                    {
                        return true;
                    }
                    else  if(tahta[i+1][j-1] == put && tahta[i][j] == put && tahta[i-1][j+1]==put)   
                    {
                        return true;
                    }
                    }
                    catch (ArrayIndexOutOfBoundsException MatematikselHata){}
                }
            }
         
         
         
           
            return false;
        }
        
        
        boolean beraberlikKontrol()
        {
            boolean bosyervarmi =false;
            for(int i =0 ;i<boyut;i++)
            {
                for(int j=0;j<boyut;j++)
                {
                    if (tahta[i][j] == 'N')
                    {
                        bosyervarmi = true;
                    }
                }
            }
           /** if (bosyervarmi == true)
            {
                boolean test = kazanan('X');
                if (test == true)
                {
                     return false;//berabere değil
                }
                else
                {
                    test = kazanan('O');
                    if(test==true)
                    {
                        return false;
                    }
                    else
                    {
                        return true;//berabere
                    }
                }
            }
            else
            {
                return false;//berabere değil
            }
            **/
           return bosyervarmi;
        }
        

    }
    
    class oyuncu
    {
        boolean insanmiyiz;
        char harf;
        String hamle;
        public oyuncu()
        {
            insanmiyiz = true;
            harf = 'X';
        }
        public oyuncu(boolean insanmiKontrolu)
        {
            insanmiyiz = insanmiKontrolu;
            if(insanmiKontrolu==true)
            {
            harf = 'X';
            }
            else
            {
            harf = 'O';
            }
        }
        public oyuncu(boolean insanmiKontrolu,char kr)
        {
            kr = Character.toUpperCase(kr);
            if(kr=='X')
            {
                harf = kr;
            }
            else if (kr=='O')
            {
                harf = kr;
            }
            else
            {
                harf = 'X';
            }
            
            insanmiyiz = insanmiKontrolu;
          
        }
        
        
        char karakteriAl()
        {
            return this.harf;
        }
       boolean oyuncuTurunuAl()
       {
           return this.insanmiyiz;
       }
       String oyuncununHamlesiniAl()
       {


       return hamle;
       }
       String  insanOyuncuHamlesiniKotrol()
       {
           System.out.println("Hamle Sırası Sizde["+this.harf+"]:");
           Scanner s = new Scanner(System.in);
           hamle = s.nextLine();
           return hamle;
       }  
       String bilgisayarHamlesiUret()
       {
             String rhamle = "";
            Random r1=new Random(); //random sınıfı
            Random r2=new Random();
          
            int randomx=  (int) (Math.random()* ebat);
            int randomy=  (int) (Math.random()* ebat);
            System.out.println(randomx+","+randomy);
            String rrandomx = "";
            String rrandomy = String.valueOf(randomy);
            
            if(randomx==0)
            {
                rrandomx = "A";
            }
            else  if(randomx==1)
            {
                rrandomx = "B";
            }
             else  if(randomx==2)
            {
                rrandomx = "C";
            }
             else  if(randomx==3)
            {
                rrandomx = "D";
            }
             else  if(randomx==4)
            {
                rrandomx = "E";
            }
             else  if(randomx==5)
            {
                rrandomx = "F";
            }
             else  if(randomx==6)
            {
                rrandomx = "G";
            }
            else
            {
                rrandomx = "B";
            }
            rhamle = rrandomx + rrandomy;
         
            return rhamle;
       }
    
    }

