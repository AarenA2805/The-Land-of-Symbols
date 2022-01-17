/**
 * 
 * The Land of Symbols
 * By Aaren Arasaratnam 
 * Nov. 30th, 2020
 * 
 */   

// The Java Scanner allows the player to input commands as a means of interacting with characters and fighting enemies; the character "Scanny" is the fictional equivalent for the Java Scanner.
// The Java Scanner is imported here (from the "java.util" package). 
import java.util.Scanner; 
public class ArasaratnamAarenGame
{
    // The Java Scanner is initalized here, and is named "scan."
    private static Scanner scan = new Scanner(System.in); 
    // "InterruptedException" must be thrown whenever a thread is waiting or sleeping; in this case, it is thrown because of the method "outputSlowly()". 
    public static void main (String[] args) throws InterruptedException
    {
        // This do-while loop executes the code under "do" ONCE; it will repeat this code as long as the condition playAgain() is true. 
        do
        {
            // GAME MENU 
            // Game Menu Variables
            String gameMenuInput, finalGameMenuInput = "";

            Thread.sleep(1000); 
            System.out.println("* Recommended: Please Play This Game in FULL SCREEN Mode! *");
            Thread.sleep(5000);
            outputSlowly(". . .", 1250, true); 
            // "System.out.print("\f") is a simple and effective way to start on a fresh, blank output screen. 
            System.out.print("\f"); 
            // These long strings of symbols foreshadow the title of the game (i.e. "The Land of Symbols"). 
            outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%\f#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@#$&+_@#$+@_#%^#@=-&^%$#@!\f$%@&+_@#$+@asd@_#%^#@=-&^%$#!", 30, false);
            outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$\f@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@\fsd@_#%^#@=-&^%$#!", 20, false);
            outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38\f@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@asd@_#%^#@=-&^%$#!3", 10, true);
            System.out.print("\f"); 
            outputSlowly("T8e L*9d (f }ymb@! B& Au@jd AL30(&atn#@", 20, true); 
            outputSlowly("\fT8e L*nd of }ymb@l! B& Aa@jd ALa0a&atn#@", 30, true); 
            outputSlowly("\fThe L*nd of }ymb@l! By Aa@en ALa0a&atn#m", 40, true);
            outputSlowly("\fThe Land of Symb@ls By Aaren ALa0a&atnam", 50, true);
            System.out.print("\f");
            outputSlowly("◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤", 5, true); 
            outputSlowly("The Land of Symbols", 75, true);
            outputSlowly("By Aaren Arasaratnam", 75, true);  
            outputSlowly("◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤◢◣◥◤", 5, true); 
            Thread.sleep(1000); 
            while(!finalGameMenuInput.equals("start") || !finalGameMenuInput.equals("quit"))
            {
                outputSlowly("* Enter 'Start' To Begin The Game. *", 60, true);
                // I didn't have time to implement the below piece of code, but it would have allowed the player to select the DIFFICULTY and COMBAT TEXT SPEED! 
                // outputSlowly("* Enter 'Settings' To Configure Game Settings *", 60, true);  
                outputSlowly("* Enter 'Quit' To Exit The Game. *", 60, true); 
                gameMenuInput = scan.nextLine(); 
                finalGameMenuInput = gameMenuInput.toLowerCase();
                if(finalGameMenuInput.equals("start"))
                {
                    outputSlowly("3-900^%$#@!#$%..#$&+_@#$+@_#%^#@=-&^%$#@!#$%@#$&+_@_fua@#$+@_#%^#@=-&^%$#@!qqqq$%@#$&+_@#$*@$#&@_#%^#@=-&^%$#@!#$%@&+_@#$+@_#%^#@=-&^%$#@!#$%@!#)({{{%@#$&+_@#asd$&+_@#$+@_#%^@!#$d8)38%@$$&+_@#$+5_#%^#@=-&ppp$#@ytOl", 20, true);
                    outputSlowly("=-&^%$#35!#26$%ss@#$&+_@#$+@_#%^#@=-&^333$#@!#$%@#$&+_@#??+@_#234#@=-&^%$#@!#$%@#$asd+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@d$+@_#%^#@=-&^%$#@!#33@4x%%^%$#@!#$%@uui*(#las:2q'::243\\\3a\\36&+_@#$+@_#%^#@=-@_#$(^%_@_fua@#$+@_", 15, true);
                    outputSlowly("5-&^%$+++@!#$%@#$d&+_@#$+@_#|'^#@=-&^%$#@!#$%@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@#$&+_@#$+@_#%^#@=-&^%$#>!#$%@&+_@#$+@_#%^#@=-&^%$#@!#$%@00*&^@;;:w#$+@_#%^#@=-&&^%$#@!)3895Psdh><fl#%6Jk23,,|\'-=_3as2f&#&%sdf\\Oasfg3\":\"", 10, true);
                    outputSlowly("=--@(%$34@!#$%@#$&3+_@?$+sdr45_#%^#@=!&ppp$#@!#)({{{%@#$&+_@#asd@$+@_#%^#@=-&^%$#@!>$%@#$&+_@#$+@_?#%^#**@=-&^%$#@!#$%@LOL+_@#$+@_#%^#@*aso-&^3&^%$#@!rs398sd29809L8df(#%[45]6'\\#ts3fHuqIUdf3F8S83#@&8912w#ydU2DLSF'';", 5, true);
                    outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@$$,+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@asd@_#%^#@=-&^%$#!!!!@3S4879F__><3/SDF398@:;23S(@*D3FD9S8@#[[]]}2D@FAD3FS2FDS978F34DHJKAH29*", 2, true);
                    System.out.print("\f");
                    Thread.sleep(5000); 
                    game();  
                }
                else if(finalGameMenuInput.equals("quit"))
                {   
                    // "System.exit(0)" terminates the Java Virtual Machine if it is running, ending the program. 
                    System.exit(0); 
                }
            }
        }
        while (playAgain());
    }

    public static void game() throws InterruptedException
    { 
        // INTRODUCTION
        // Dialogue Variables
        String dialogueInput, finalDialogueInput = ""; 
        String playerName = ""; 

        outputSlowly("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃", 5, true); 
        outputSlowly(". . .", 500, true);
        outputSlowly("???: Hellooooooooooooooooo...?", 65, true); 
        Thread.sleep(2000); 
        outputSlowly("???: Anybody here? ", 65, false);
        Thread.sleep(1000);
        outputSlowly("Hellooooooo...?", 65, true); 
        Thread.sleep(2000);
        outputSlowly(". . .", 500, true);
        outputSlowly("???: OH! ", 5, false); 
        Thread.sleep(500); 
        outputSlowly("Hello! ", 20, false); 
        Thread.sleep(200); 
        outputSlowly("You okay?", 30, true); 
        System.out.println("* Enter 'Yes' or 'No'. *"); 
        dialogueInput = scan.nextLine();
        finalDialogueInput = dialogueInput.toLowerCase();
        while(!finalDialogueInput.equals("yes") || !finalDialogueInput.equals("no"))
        {
            if(finalDialogueInput.equals("yes"))
            {
                outputSlowly("???: Great to hear! ", 35, false); 
                Thread.sleep(250); 
                outputSlowly("Looked like you took quite a spill... ", 35, false); 
                Thread.sleep(750); 
                outputSlowly("or two. ", 35, false); 
                Thread.sleep(500); 
                outputSlowly("Your name?", 35, true);
                System.out.println("* Enter Your Name. *"); 
                playerName = scan.nextLine(); 
                outputSlowly("???: Nice to meet ya " + playerName + "!", 40, true);
                break;
            }
            else if(finalDialogueInput.equals("no"))
            {
                outputSlowly("???: Oh no! ", 10, false);
                Thread.sleep(250); 
                outputSlowly("Let's get ya back on your feet...", 30, true);
                Thread.sleep(600); 
                outputSlowly(". . .", 700, true); 
                outputSlowly("???: Ah, there we go! ", 20, true);
                Thread.sleep(250);
                outputSlowly("???: Looked like you took quite a spill... ", 35, false); 
                Thread.sleep(750);
                outputSlowly("or two. ", 35, true); 
                Thread.sleep(1000);
                outputSlowly("???: Apologies, I don't believe I caught your name. ", 25, false); 
                Thread.sleep(250); 
                outputSlowly("What d'you go by?", 25, true);
                System.out.println("* Enter Your Name. *"); 
                playerName = scan.nextLine();
                outputSlowly("???: Nice to meet ya " + playerName + "!", 40, true); 
                break;
            }
            else
            {
                Thread.sleep(100); 
                outputSlowly("???: Apologies, couldn't hear ya that well. ", 30, false); 
                Thread.sleep(200);
                outputSlowly("You feelin' okay? ", 30, false); 
                Thread.sleep(500); 
                outputSlowly("Yes? ", 15, false);  
                Thread.sleep(500); 
                outputSlowly("No?", 15, true);
                System.out.println("* Please Enter 'Yes' or 'No'. *");  
                dialogueInput = scan.nextLine();
                finalDialogueInput = dialogueInput.toLowerCase();
            }
        }
        Thread.sleep(500); 
        outputSlowly("Scanny: The name's Scanny. ", 35, false); 
        Thread.sleep(750); 
        outputSlowly("Welcome to the Land of—", 35, true);
        Thread.sleep(2500); 
        outputSlowly("Scanny: It's here.", 60, true); 
        Thread.sleep(1250); 
        outputSlowly("???: Hehehehehe! ", 30, false);  
        Thread.sleep(1250); 
        outputSlowly("HeheheheheHEHEHEHEHE!! ", 25, false);
        Thread.sleep(1250); 
        outputSlowly("HEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHE!!!", 20, true); 
        Thread.sleep(1000); 
        outputSlowly("Scanny: Quick " + playerName + ", " + "there's no time to explain! ", 30, false);
        Thread.sleep(500); 
        outputSlowly("Take this...", 30, true); 
        Thread.sleep(1000); 
        System.out.println("* You have acquired \"USER INPUT\"! *"); 
        Thread.sleep(1000); 
        outputSlowly("Scanny: Enter 'T' for \"True\" OR 'F' for \"False\" to choose the BETTER outcome.", 30, true); 
        Thread.sleep(2000);
        outputSlowly("Scanny: You'll figure it out, don't worry! Just remember to READ CAREFULLY!", 30, true); 
        Thread.sleep(2000); 
        outputSlowly("Scanny: I'll be... ", 25, false); 
        Thread.sleep(250);
        outputSlowly("uh... ", 30, false);  
        Thread.sleep(250);
        outputSlowly("waiting over here in this corner for your inevitable victory!", 30, true); 
        Thread.sleep(1250);
        outputSlowly("???: If Scanny no want to play... ", 30, false); 
        Thread.sleep(750); 
        outputSlowly("DO YOU WANT TO PLAY? ", 55, false);
        Thread.sleep(500); 
        outputSlowly("HEHEHEHEHEHEHEHEHEHEHE!", 35, true);
        Thread.sleep(200); 
        outputSlowly("═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-", 5, true); 
        System.out.println("* Cue EPIC Boss Battle Music! *"); 
        Thread.sleep(2500); 

        // GAMEPLAY
        // Combat Variables 
        int playerHP = 100, enemyHP = 500;
        int enemyAbility = 0, damageToEnemy = 0, damageToPlayer = 0, healForEnemy = 0, healForPlayer = 0; 
        String playerAbilities = "* Your Abilities -  (T)rue   (F)alse   *"; 
        String combatInput = ""; 
        char combatChoice = ' ';

        while(playerHP > 0 && enemyHP > 0)
        {
            // Enemy's Turn
            System.out.println("[" + playerName + "'s HP: " + playerHP + "]");      
            System.out.println("[??? HP: " + enemyHP + "]");  
            if(enemyHP > 0)
            {
                // The enemy has a total of 5 abilities; the method "Math.random()" is multipled by 6 instead of 5 because it is casted to an integer, meaning the decimal is truncated. 
                // Thus, the highest possible number is 5.99999...., which becomes a 5 due to casting. 
                enemyAbility = (int)(Math.random() * 6); 
                // Ability 0: The player must choose whether they want to deal damage to themselves AND the enemy OR heal themselves AND the enemy. 
                if(enemyAbility == 0)
                {
                    damageToEnemy = (int)(Math.random() * 100); 
                    damageToPlayer = (int)(Math.random() * 75); 
                    healForEnemy = (int)(Math.random() * 100); 
                    healForPlayer = (int)(Math.random() * 75); 
                    System.out.println("                                                        "); 
                    System.out.println("if(true)                                                ");
                    System.out.println("{                                                       "); 
                    System.out.println("    Deal " + damageToEnemy + " Damage to ???            ");       
                    System.out.println("    Deal " + damageToPlayer + " Damage to " + playerName );
                    System.out.println("}                                                       "); 
                    System.out.println("else(false)                                             ");
                    System.out.println("{                                                       ");
                    System.out.println("    Heal ??? for " + healForEnemy + " HP.               ");     
                    System.out.println("    Heal " + playerName + " for " + healForPlayer + " HP");      
                    System.out.println("}                                                       "); 
                    System.out.println("                                                        "); 
                }
                // Ability 1: This ability is similar to Ability 0, but the healing effects are under "if(true)" instead of "else(false)," and the damage effects are under "else(false)" instead of "if(true)."
                else if(enemyAbility == 1)
                {
                    damageToEnemy = (int)(Math.random() * 100); 
                    damageToPlayer = (int)(Math.random() * 75); 
                    healForEnemy = (int)(Math.random() * 100); 
                    healForPlayer = (int)(Math.random() * 75); 
                    System.out.println("                                                        "); 
                    System.out.println("if(true)                                                ");
                    System.out.println("{                                                       "); 
                    System.out.println("    Heal ??? for " + healForEnemy + " HP.               ");     
                    System.out.println("    Heal " + playerName + " for " + healForPlayer + " HP"); 
                    System.out.println("}                                                       "); 
                    System.out.println("else(false)                                             ");
                    System.out.println("{                                                       ");
                    System.out.println("    Deal " + damageToEnemy + " Damage to ???            ");       
                    System.out.println("    Deal " + damageToPlayer + " Damage to " + playerName );
                    System.out.println("}                                                       "); 
                    System.out.println("                                                        "); 
                }
                // Ability 2: This ability forces the player to either deal damage to the enemy OR heal themselves. 
                else if(enemyAbility == 2)
                {
                    damageToEnemy = (int)(Math.random() * 75); 
                    healForPlayer = (int)(Math.random() * 75); 
                    System.out.println("                                                        "); 
                    System.out.println("if(true)                                                ");
                    System.out.println("{                                                       "); 
                    System.out.println("    Deal " + damageToEnemy + " Damage to ???            ");       
                    System.out.println("}                                                       "); 
                    System.out.println("else(false)                                             ");
                    System.out.println("{                                                       ");    
                    System.out.println("    Heal " + playerName + " for " + healForPlayer + " HP");      
                    System.out.println("}                                                       "); 
                    System.out.println("                                                        "); 
                }
                // Ability 3: This ability forces the player to either heal the enemy OR damage themselves. 
                else if(enemyAbility == 3)
                {
                    damageToPlayer = (int)(Math.random() * 100); 
                    healForEnemy = (int)(Math.random() * 100); 
                    System.out.println("                                                       "); 
                    System.out.println("if(true)                                               ");
                    System.out.println("{                                                      "); 
                    System.out.println("    Heal ??? for " + healForEnemy + " HP.              ");     
                    System.out.println("}                                                      "); 
                    System.out.println("else(false)                                            ");
                    System.out.println("{                                                      ");
                    System.out.println("    Deal " + damageToPlayer + " Damage to " + playerName);
                    System.out.println("}                                                      "); 
                    System.out.println("                                                       "); 
                }
                // Ability 4: This ability is similar to Ability 2, but the healing and damage effects are SWAPPED. This checks to see if the player is paying attention or not!
                else if(enemyAbility == 4)
                {
                    damageToEnemy = (int)(Math.random() * 75); 
                    healForPlayer = (int)(Math.random() * 75); 
                    System.out.println("                                                        "); 
                    System.out.println("if(true)                                                ");
                    System.out.println("{                                                       "); 
                    System.out.println("    Heal " + playerName + " for " + healForPlayer + " HP");
                    System.out.println("}                                                       "); 
                    System.out.println("else(false)                                             ");
                    System.out.println("{                                                       ");    
                    System.out.println("    Deal " + damageToEnemy + " Damage to ???            ");       
                    System.out.println("}                                                       "); 
                    System.out.println("                                                        "); 
                }
                // Ability 5: This ability is similar to Ability 3, but the healing and damage effects are SWAPPED. This checks to see if the player is paying attention or not!
                else if(enemyAbility == 5)
                {
                    damageToPlayer = (int)(Math.random() * 100); 
                    healForEnemy = (int)(Math.random() * 100); 
                    System.out.println("                                                       "); 
                    System.out.println("if(true)                                               ");
                    System.out.println("{                                                      "); 
                    System.out.println("    Deal " + damageToPlayer + " Damage to " + playerName);
                    System.out.println("}                                                      "); 
                    System.out.println("else(false)                                            ");
                    System.out.println("{                                                      ");
                    System.out.println("    Heal ??? for " + healForEnemy + " HP.              ");     
                    System.out.println("}                                                      "); 
                    System.out.println("                                                       "); 
                } 
            }

            // Player's Turn
            do
            {
                System.out.println(playerAbilities);
                System.out.println("Please Enter Your Choice: ");
                combatInput = scan.nextLine();
                combatChoice = combatInput.toUpperCase().charAt(0); 
            }
            // This ensures the player is inputting either 'T' or 'F', and not anything else! 
            while(!checkValidInput(combatChoice));
            // This large if-statement outputs the effects of the code under the "if(true)" for each ability (if the player chose 'T').  
            if(combatChoice == 'T')
            {
                if(enemyAbility == 0)
                {  
                    enemyHP -= damageToEnemy; 
                    // This code ensures ???'s HP does NOT go below 0 (i.e. become a negative integer).
                    // Because Math.max() returns the GREATER of two integer values, if ???'s HP does go into the negatives, Math.max() ensures 0 is returned.
                    enemyHP = Math.max(0, enemyHP); 
                    playerHP -= damageToPlayer;
                    // This code ensures the player's HP does NOT go below 0 (i.e. become a negative integer).
                    // Because Math.max() returns the GREATER of two integer values, if the player's HP does go into the negatives, Math.max() ensures 0 is returned.
                    playerHP = Math.max(0, playerHP); 
                    System.out.println("                                                                                                                   "); 
                    System.out.println("* " + playerName + " dealt " + damageToEnemy + " damage to ???, but took " + damageToPlayer + " damage in return! *"); 
                    System.out.println("                                                                                                                   ");
                }
                else if(enemyAbility == 1)
                {
                    enemyHP += healForEnemy;
                    playerHP += healForPlayer;
                    System.out.println("                                                                                                       "); 
                    System.out.println("* " + playerName + " healed for " + healForPlayer + " HP, but healed ??? for " + healForEnemy + " HP! *");
                    System.out.println("                                                                                                       "); 
                }
                else if(enemyAbility == 2)
                {
                    enemyHP -= damageToEnemy;
                    enemyHP = Math.max(0, enemyHP); 
                    System.out.println("                                                                 "); 
                    System.out.println("* " + playerName + " dealt " + damageToEnemy + " damage to ???! *"); 
                    System.out.println("                                                                 ");
                }
                else if(enemyAbility == 3)
                {
                    enemyHP += healForEnemy;
                    System.out.println("                                                              "); 
                    System.out.println("* " + playerName + " healed ??? for " + healForEnemy + " HP! *");
                    System.out.println("                                                              "); 
                }
                else if(enemyAbility == 4)
                {
                    playerHP += healForPlayer;
                    System.out.println("                                                           "); 
                    System.out.println("* " + playerName + " healed for " + healForPlayer + " HP! *");
                    System.out.println("                                                           "); 
                }
                else if(enemyAbility == 5)
                {
                    playerHP -= damageToPlayer;
                    playerHP = Math.max(0, playerHP);
                    System.out.println("                                                          "); 
                    System.out.println("* " + playerName + " took " + damageToPlayer + " damage! *"); 
                    System.out.println("                                                          ");
                }
            }
            // This large if-statement outputs the effects of the code under the "else(false)" for each ability (if the player chose 'F').  
            if(combatChoice == 'F')
            {
                if(enemyAbility == 0)
                {
                    enemyHP += healForEnemy;
                    playerHP += healForPlayer;
                    System.out.println("                                                                                                       "); 
                    System.out.println("* " + playerName + " healed for " + healForPlayer + " HP, but healed ??? for " + healForEnemy + " HP! *");
                    System.out.println("                                                                                                       "); 
                }
                else if(enemyAbility == 1)
                {
                    enemyHP -= damageToEnemy;
                    enemyHP = Math.max(0, enemyHP); 
                    playerHP -= damageToPlayer;
                    playerHP = Math.max(0, playerHP); 
                    System.out.println("                                                                                                                   "); 
                    System.out.println("* " + playerName + " dealt " + damageToEnemy + " damage to ???, but took " + damageToPlayer + " damage in return! *"); 
                    System.out.println("                                                                                                                   ");
                }
                else if(enemyAbility == 2)
                {
                    playerHP += healForPlayer;
                    System.out.println("                                                           "); 
                    System.out.println("* " + playerName + " healed for " + healForPlayer + " HP! *");
                    System.out.println("                                                           "); 
                }
                else if(enemyAbility == 3)
                {
                    playerHP -= damageToPlayer; 
                    playerHP = Math.max(0, playerHP); 
                    System.out.println("                                                          "); 
                    System.out.println("* " + playerName + " took " + damageToPlayer + " damage! *"); 
                    System.out.println("                                                          ");
                }
                else if(enemyAbility == 4)
                {
                    enemyHP -= damageToEnemy;
                    enemyHP = Math.max(0, enemyHP); 
                    System.out.println("                                                                 "); 
                    System.out.println("* " + playerName + " dealt " + damageToEnemy + " damage to ???! *"); 
                    System.out.println("                                                                 ");
                }
                else if(enemyAbility == 5)
                {
                    enemyHP += healForEnemy; 
                    playerHP += healForPlayer;
                    System.out.println("                                                              "); 
                    System.out.println("* " + playerName + " healed ??? for " + healForEnemy + " HP! *");
                    System.out.println("                                                              ");
                }
            }
        }

        // The "if" of this if-else-if statement takes the player to the "Game Over" screen if their health drops to 0 (or below 0). 
        if(playerHP == 0)
        {
            System.out.println("[" + playerName + "'s HP: " + playerHP + "]");      
            System.out.println("[??? HP: " + enemyHP + "]");   
            Thread.sleep(500); 
            System.out.println("                   ");
            outputSlowly("* " + playerName + " died... *", 50, true); 
            Thread.sleep(3000); 
            outputSlowly("═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-", 5, true); 
            outputSlowly("Scanny: NOOO! " + playerName + "! D;", 45, true);
            Thread.sleep(2000); 
            System.out.println("* Cue Super Mario Bros. 'Game Over' Music. ;( *"); 
            Thread.sleep(5000); 
            System.out.println("* Awhh, you died! Would you like to try again? *"); 
            System.out.println("* Enter 'Yes' or 'No'. *"); 
            String response = scan.nextLine();
            char finalResponse = response.toUpperCase().charAt(0);
            if(finalResponse == 'Y')
            {
                System.out.print("\f");
                Thread.sleep(2000); 
                game(); 
            }
            else if(finalResponse == 'N')
            {
                System.exit(0);
            }
        }
        // The "else if" of this if-else-if statement takes the player to the "Conclusion," but only if they successfully defeated the enemy (i.e. drop its health to 0 or below). 
        else if(enemyHP == 0)
        {
            // CONCLUSION 
            outputSlowly("???: I-I just wanted to play...", 50, true);
            Thread.sleep(1000);
            outputSlowly("* ??? was vanquished! :D *", 35, true); 
            Thread.sleep(2500); 
            outputSlowly("═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-═-", 5, true); 
            outputSlowly("Scanny: Wait... You a-actually killed it?! Huh?!", 30, true);
            Thread.sleep(3000); 
            outputSlowly("Scanny: Fair play man. That wasn't exactly the easiest thing to do. Believe me, I've tried PLENTY of times.", 35, true);
            Thread.sleep(1250);
            outputSlowly("Scanny: Sooooo you're probably wondering what that thing was...", 30, true); 
            Thread.sleep(1000); 
            outputSlowly("Scanny: In these parts, we like to call 'em... ", 30, false); 
            outputSlowly("\"amalgamations\"... Creatures made of strings upon strings of letters, numbers... All sorts of characters.", 30, true); 
            Thread.sleep(2000); 
            outputSlowly("Scanny: This place you find yourself in is full of 'em, and as the protector of these lands, it's my job to... ", 30, false);
            Thread.sleep(1500); 
            outputSlowly("\"retire\" 'em.", 45, true); 
            Thread.sleep(3000); 
            outputSlowly("Scanny: Regardless, some of 'em prove to be quite a handful, like this rascal ya just fought.", 30, true);  
            Thread.sleep(1000); 
            outputSlowly("Scanny: Which is why I was wondering... if you'd be interested in helping me out. ", 40, false);  
            Thread.sleep(1000); 
            outputSlowly("Just for a short while of course.", 35, true); 
            Thread.sleep(3000); 
            outputSlowly("Scanny: So whaddya say?", 40, true); 
            System.out.println("* Enter 'Yes'*"); 
            dialogueInput = scan.nextLine();
            finalDialogueInput = dialogueInput.toLowerCase();
            if(finalDialogueInput.equals("yes"))
            {
                outputSlowly("Scanny: For real?! LET'S GO!!", 30, true);
            }
            else
            {
                outputSlowly("Scanny: I'll take that as a \"YES\"!", 30, true);
            }
        }
        Thread.sleep(1000); 
        outputSlowly("Scanny: Scanny and " + playerName + "," + " the ultimate duo, ridding the land of amalgamations!", 30, true); 
        Thread.sleep(1000);
        outputSlowly("Scanny: Aight then, I'll guess we'll keep in touch.", 35, true);
        Thread.sleep(1250); 
        outputSlowly("Scanny: Lemme know when you're ready " + playerName + ", 'cause you're the BOSS!", 30, true); 
        Thread.sleep(2500); 
        outputSlowly("Scanny: This is YOUR world after all. :)", 65, true); 
        Thread.sleep(100); 
        outputSlowly("3-900^%$#@!#$%..#$&+_@#$+@_#%^#@=-&^%$#@!#$%@#$&+_@_fua@#$+@_#%^#@=-&^%$#@!qqqq$%@#$&+_@#$*@$#&@_#%^#@=-&^%$#@!#$%@&+_@#$+@_#%^#@=-&^%$#@!#$%@!#)({{{%@#$&+_@#asd$&+_@#$+@_#%^@!#$d8)38%@$$&+_@#$+5_#%^#@=-&ppp$#@ytOl", 20, true);
        outputSlowly("=-&^%$#35!#26$%ss@#$&+_@#$+@_#%^#@=-&^333$#@!#$%@#$&+_@#??+@_#234#@=-&^%$#@!#$%@#$asd+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@d$+@_#%^#@=-&^%$#@!#33@4x%%^%$#@!#$%@uui*(#las:2q'::243\\\3a\\36&+_@#$+@_#%^#@=-@_#$(^%_@_fua@#$+@_", 15, true);
        outputSlowly("5-&^%$+++@!#$%@#$d&+_@#$+@_#|'^#@=-&^%$#@!#$%@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@#$&+_@#$+@_#%^#@=-&^%$#>!#$%@&+_@#$+@_#%^#@=-&^%$#@!#$%@00*&^@;;:w#$+@_#%^#@=-&&^%$#@!)3895Psdh><fl#%6Jk23,,|\'-=_3as2f&#&%sdf\\Oasfg3\":\"", 10, true);
        outputSlowly("=--@(%$34@!#$%@#$&3+_@?$+sdr45_#%^#@=!&ppp$#@!#)({{{%@#$&+_@#asd@$+@_#%^#@=-&^%$#@!>$%@#$&+_@#$+@_?#%^#**@=-&^%$#@!#$%@LOL+_@#$+@_#%^#@*aso-&^3&^%$#@!rs398sd29809L8df(#%[45]6'\\#ts3fHuqIUdf3F8S83#@&8912w#ydU2DLSF'';", 5, true);
        outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@$$,+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@asd@_#%^#@=-&^%$#!!!!@3S4879F__><3/SDF398@:;23S(@*D3FD9S8@#[[]]}2D@FAD3FS2FDS978F34DHJKAH29*", 2, true);
        System.out.print("\f");
        Thread.sleep(2500); 
        outputSlowly("•:•.•:•.•:•:•:•:•:•:•:•☾☼☽•:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:•☾☼☽•:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:•☾☼☽•:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:•☾☼☽•:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:", 5, true); 
        Thread.sleep(5000); 
        outputSlowly("* You blink and, all of a sudden, you find yourself back in your room. *", 40, true);
        Thread.sleep(500);
        outputSlowly("* You turn on your computer and open your latest coding project on BlueJ. *", 40, true);
        Thread.sleep(500); 
        outputSlowly("* You read the title: *", 60, true); 
        Thread.sleep(2000); 
        outputSlowly("* \"A Land of Symbols\" *", 100, true); 
        Thread.sleep(1500);
        outputSlowly("* You smile... compile... and method call 'void main(String[] args)'... *", 45, true); 
        Thread.sleep(1500); 
        outputSlowly("* You press 'OK' *", 65, true); 
        Thread.sleep(4000);
        outputSlowly("\fU-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%\f#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@#$&+_@#$+@_#%^#@=-&^%$#@!\f$%@&+_@#$+@asd@_#%^#@=-&^%$#!", 30, false);
        outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$\f@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38%@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@\fsd@_#%^#@=-&^%$#!", 20, false);
        outputSlowly("U-&';\"%$#@!#$%@sd$&+_@#$+@_#%^#@=-@_#$(^%$#@!#$%@#$&+_@#$+@____%^#@=-&^%$#@!#$d8)38\f@#$&+_@#$+@_#%^#@=-&^%$#@!#$%@&+_@#$+@asd@_#%^#@=-&^%$#!3", 10, true);
        System.out.print("\f"); 
        outputSlowly("T8 ^% }&Hjyn#eT", 10, true); 
        outputSlowly("\fT8 ^e }oHjin#eT", 20, true);
        outputSlowly("\fT8 ^e }onjin#ed", 30, true);
        outputSlowly("\fT8 Be C&njin#ed", 40, true);
        outputSlowly("\fTo Be Continued", 50, true);
        Thread.sleep(2000); 
        System.out.print("\f");
        Thread.sleep(2000);

        // PLAY AGAIN? 
        outputSlowly("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", 5, true);
        outputSlowly(". . .", 500, true);
        System.out.println("* Thank you so much for playing! Would you like to play again? *");
        System.out.println("* Enter 'Yes' or 'No'. *"); 
        outputSlowly("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=", 5, true);
        String response = scan.nextLine();
        char finalResponse = response.toUpperCase().charAt(0);
        if(finalResponse == 'Y')
        {
            System.out.print("\f");
            // This calls the "game()" method, restarting the game back to moment before they meet Scanny (if they respond with 'Yes' to the above prompt). 
            game(); 
        }
        else if(finalResponse == 'N')
        {
            System.exit(0);
        }
    }

    /**
     * This method allows the player to replay the game from the start. 
     * Precondition: The player receives the message "* Thank you so much for playing! Would you like to play again? *" and is then prompted to enter 'Yes' or 'No'. 
     * Postcondition: The player will either restart the game or exit the game (if they respond with 'Yes' and 'No' respectively). 
     */
    private static boolean playAgain() 
    {
        return true;
    }

    // Borrowed from you, Mr. Cohen! 
    /**
     * This method outputs characters of a word/phrase one at a time. 
     * Precondition: The player receives no output. 
     * Postcondition: The player receives individual characters that form larger words/phrases.  
     */
    private static void outputSlowly (String word, int delay, boolean newLine) throws InterruptedException
    {
        for(int i = 0; i < word.length(); i++)
        {
            System.out.print(word.charAt(i));
            Thread.sleep(delay);
        }
        if(newLine)
        {
            System.out.println();
        }
    }

    /**
     * This method ensures the player's inputs are valid, and corrects them if they are not.
     * Precondition: The player inputs a character/word/phrase using the Scanner class. 
     * Postcondition: The player will either receive a warning message (i.e. "* Invalid input! Try again. *") or receieve nothing at all. 
     */
    private static boolean checkValidInput (char userInput)
    {
        if(userInput == 'T' || userInput == 'F')
        {
            return true;
        }
        if(userInput != '_')
        {
            System.out.println("* Invalid input! Try again. *"); 
        }
        return false;
    }
}