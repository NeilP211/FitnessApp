import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Programs {
    private JFrame mainFrame;

    // Main page variables
    private String mainPageName = "Programs";
    private String mainPageButton1Text = "Powerlifting";
    private String mainPageButton2Text = "Hypertrophy";
    private String mainPageButton3Text = "Sports Specific";
    private String mainPageButton4Text = "Crossfit";

    // Page variables
    private String page1Name = "Powerlifting";
    private String page1Text = "Powerlifting programs are structured training routines designed to enhance an athlete's strength in the squat, bench press, and deadlift. These programs typically incorporate a combination of compound exercises, accessory work, and variations of the main lifts to target specific weaknesses and build overall strength. Powerlifting programs often follow a periodized approach, cycling through different phases of intensity and volume to optimize strength gains and allow for proper recovery. Common programs include linear progression, where the weight increases steadily over time, and more advanced programs like 5/3/1 or Sheiko, which employ varying sets, reps, and intensities. Tailoring a powerlifting program to an individual's specific needs and goals is crucial for success in the sport. Below are two good beginner powerlifitng programs";
    private String subPage1Button1Text = "StrongLifts 5x5";
    private String subPage1Button2Text = "Beginners 5/3/1";
    private String subPage1Name1 = "StrongLifts 5x5";
    private String subPage1Text1 = "The StrongLifts 5x5 program is a popular beginner strength training regimen by Mehdi Hadim. It focuses on compound lifts like squat, bench press, deadlift, overhead press, and barbell row. The workout frequency is three times a week (e.g., Monday, Wednesday, and Friday). The program follows a linear progression model, where you increase the weight for each exercise in every session. Warm-up sets are recommended before each working set. For squats and deadlifts, you add 2.5 kg (or 5 lbs) each workout; for bench press, overhead press, and barbell row, add 1.25 kg (or 2.5 lbs) each workout. If you fail to complete 5x5 for two consecutive workouts on a lift, deload the weight by 10% and work your way back up. Initially, the program suggests focusing mainly on the main lifts without additional accessory exercises to build a strong foundation.";
    private String subPage1Name2 = "Beginners 5/3/1";
    private String subPage1Text2 = "The 5/3/1 program by Jim Wendler is a flexible strength training routine suitable for beginners. The main lifts are Overhead Press, Deadlift, Bench Press, and Squat. Typically done four times a week in four-week cycles, the main lift follows a 5/3/1 rep scheme with optional Joker Sets for added intensity. After each cycle, increase the training max for progression. Accessory work can include chin-ups/pull-ups and other exercises tailored to individual goals. Every fourth week is a deload week to aid recovery. A sample weekly schedule might include Overhead Press, Deadlift, Bench Press, and Squat on separate days, with assistance work after each main lift session. It's crucial to start with conservative weights, prioritize form, and make adjustments based on individual needs and progress. Consulting with a fitness professional can help tailor the program further.";

    private String page2Name = "Hypertrophy";
    private String page2Text = "A hypertrophy program is designed to promote muscle growth by incorporating moderate to high-volume resistance training, focusing on a moderate rep range of around 8 to 12 repetitions per set. This typically involves a mix of compound and isolation exercises, ensuring comprehensive muscle stimulation. With an emphasis on progressive overload, individuals follow a structured program with moderate rest periods, multiple weekly sessions per muscle group, and attention to nutrition, including a slight caloric surplus and sufficient protein intake. Patience and consistency are crucial, recognizing that muscle development is a gradual process that requires long-term dedication and proper recovery.";
    private String subPage2Button1Text = "PPL";
    private String subPage2Button2Text = "Arnold Split";
    private String subPage2Name1 = "PPL";
    private String subPage2Text1 = "The Push, Pull, Legs (PPL) training split is a popular and effective workout routine. It divides exercises into three main categories: push (e.g., chest, shoulders, triceps), pull (e.g., back, biceps), and legs (e.g., quadriceps, hamstrings, calves). The program typically involves training each category on separate days and includes compound and isolation exercises to target various muscle groups. This split allows for balanced development, adequate rest for specific muscle groups, and flexibility in workout frequency. PPL is known for its simplicity, versatility, and suitability for both beginners and advanced lifters, making it a widely adopted approach for strength and muscle building.";
    private String subPage2Name2 = "Arnold Split";
    private String subPage2Text2 = "The Arnold Schwarzenegger split, often referred to as the Arnold Split, is a classic bodybuilding workout routine. Named after the legendary bodybuilder and actor Arnold Schwarzenegger, this split typically involves training different muscle groups on different days throughout the week. The routine often includes a focus on chest and back on one day, shoulders and arms on another day, and legs on a separate day. The Arnold Split emphasizes a high volume of work, incorporating both compound and isolation exercises to target specific muscle groups. This approach allows for intense training sessions with ample rest between muscle groups, promoting overall muscle development and symmetry.";

    private String page3Name = "Sports-Specific";
    private String page3Text = "In the context of eGym, a sports-specific workout program refers to a training regimen designed and customized within the eGym platform to meet the specific needs and requirements of a particular sport. eGym is a digital fitness platform that provides personalized workout plans and guidance based on individual goals and preferences. A sports-specific program on eGym would likely incorporate exercises and training modalities tailored to enhance the athlete's performance in their chosen sport. This might include a combination of strength training, cardiovascular exercises, and sport-specific drills, all adapted to the unique demands of the targeted athletic activity. The eGym platform's technology allows for individualized tracking, progression monitoring, and adjustments to ensure the training plan aligns with the athlete's goals and the specific requirements of their sport.";
    private String subPage3Button1Text = "Basketball";
    private String subPage3Button2Text = "Baseball";
    private String subPage3Name1 = "Basketball";
    private String subPage3Text1 = "TA basketball sports gym program incorporates specific movements geared towards improving skills essential for the court. Strength training may include exercises like squats and lunges to enhance lower body power and stability. Agility drills, such as ladder footwork or cone drills, work on quick directional changes crucial for defensive maneuvers and offensive plays. Plyometric exercises like box jumps and medicine ball throws aim to boost explosive power, essential for rebounds and vertical jumps during shots. Ball handling drills and shooting practice are integrated to refine technical skills. Cardiovascular conditioning through activities like sprint intervals and shuttle runs ensures players maintain the endurance required for the fast-paced nature of basketball games. Additionally, functional movements like lateral shuffles and defensive slides mimic in-game motions, contributing to overall agility and defensive prowess on the court.";
    private String subPage3Name2 = "Baseball";
    private String subPage3Text2 = "A baseball sports gym program is tailored to enhance the specific skills and physical attributes needed for success on the baseball field. Strength training often includes exercises like deadlifts and rotational core work to improve hitting power and throwing strength. Speed and agility drills, such as ladder drills and cone sprints, are integrated to enhance base running, fielding, and quick lateral movements. Plyometric exercises like medicine ball throws and jumps contribute to explosive movements required in both hitting and fielding. Shoulder stability exercises and specific arm strengthening drills help prevent injuries common in baseball, particularly for pitchers. Skill-focused components involve batting cage sessions for refining hitting techniques, throwing accuracy drills, and fielding practice. Overall, the baseball sports gym program is designed to optimize the player's strength, speed, agility, and skill set, ensuring they are well-prepared for the dynamic challenges of the baseball diamond.";

    private String page4Name = "Crossfit";
    private String page4Text = "CrossFit is a high-intensity fitness program that combines elements of weightlifting, cardiovascular exercise, and gymnastics. It focuses on functional movements performed at a high intensity to improve overall fitness and athletic performance. Workouts, known as WODs (Workouts of the Day), vary daily and include a mix of exercises such as weightlifting, running, rowing, and bodyweight movements. CrossFit emphasizes ten general physical skills: cardiovascular and respiratory endurance, stamina, strength, flexibility, power, speed, coordination, agility, balance, and accuracy. The community aspect is central to CrossFit, with participants often training together and supporting each other. The goal is to create well-rounded athletes capable of handling a wide range of physical challenges.";
    private String subPage4Button1Text = "CrossFit Main ";
    private String subPage4Button2Text = "CrossFit Games";
    private String subPage4Name1 = "CrossFit Main";
    private String subPage4Text1 = "The CrossFit Main Site, available at CrossFit.com, provides the daily Workout of the Day (WOD) for CrossFit enthusiasts worldwide. These WODs are designed to be scalable for all fitness levels and cover a diverse range of movements, from weightlifting and gymnastics to cardiovascular exercises. The program's emphasis on constantly varied workouts aims to build overall fitness and functional capacity, making it accessible to a broad audience seeking a challenging and diverse exercise routine.";
    private String subPage4Name2 = "CrossFit Games";
    private String subPage4Text2 = "Tailored for elite athletes aspiring to compete in the CrossFit Games, the CrossFit Games Training program is a specialized regimen focusing on advanced skill development, strength building, and competition-specific strategies. This program goes beyond the general workouts found on the main site, providing insights into the intense training routines of top-level CrossFit athletes. It is designed to push participants to their limits, preparing them for the demands of high-level CrossFit competition and showcasing the rigorous training required to compete at the highest echelons of the sport.";

    public void createAndShowGUI() {
        mainFrame = new JFrame(mainPageName);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBackground(Color.BLACK);  // Black background
        mainFrame.setLayout(new GridLayout(2, 2, 10, 10)); // 2 rows, 2 columns, with 10 pixels horizontal and vertical gap

        JButton button1 = createStyledButton(mainPageButton1Text);
        JButton button2 = createStyledButton(mainPageButton2Text);
        JButton button3 = createStyledButton(mainPageButton3Text);
        JButton button4 = createStyledButton(mainPageButton4Text);

        button1.addActionListener(new ButtonListener(page1Name, page1Text, subPage1Button1Text, subPage1Text1, subPage1Button2Text, subPage1Text2));
        button2.addActionListener(new ButtonListener(page2Name, page2Text, subPage2Button1Text, subPage2Text1, subPage2Button2Text, subPage2Text2));
        button3.addActionListener(new ButtonListener(page3Name, page3Text, subPage3Button1Text, subPage3Text1, subPage3Button2Text, subPage3Text2));
        button4.addActionListener(new ButtonListener(page4Name, page4Text, subPage4Button1Text, subPage4Text1, subPage4Button2Text, subPage4Text2));

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);

        mainFrame.setSize(600, 600);
        mainFrame.setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.RED);
        button.setFocusPainted(false);
        return button;
    }
    private void openNewPage(String pageName, String pageText, String subPageButton1Text, String subPageText1, String subPageButton2Text, String subPageText2) {
        JFrame pageFrame = new JFrame(pageName);
        pageFrame.setSize(400, 300);
        pageFrame.setLayout(new BorderLayout());
        pageFrame.setBackground(Color.BLACK);

        JTextArea textArea = new JTextArea(pageText);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.RED);

        JScrollPane scrollPane = new JScrollPane(textArea);
        pageFrame.add(scrollPane, BorderLayout.CENTER);

        JButton backButton = new JButton("Back  \u2190");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pageFrame.dispose();
                mainFrame.setVisible(true);
            }
        });
        backButton.setFocusPainted(false);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.RED);
        pageFrame.add(backButton, BorderLayout.NORTH);

        JPanel smallButtonPanel = new JPanel(new GridLayout(1, 2, 5, 0));
        smallButtonPanel.setBackground(Color.BLACK);

        JButton smallButton1 = createSmallButton(subPageButton1Text);
        JButton smallButton2 = createSmallButton(subPageButton2Text);

        smallButton1.addActionListener(new SmallButtonListener(subPageButton1Text, pageName, subPageText1));
        smallButton2.addActionListener(new SmallButtonListener(subPageButton2Text, pageName, subPageText2));

        smallButtonPanel.add(smallButton1);
        smallButtonPanel.add(smallButton2);

        pageFrame.add(smallButtonPanel, BorderLayout.SOUTH);

        pageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set to dispose on close
        pageFrame.setLocationRelativeTo(mainFrame);
        pageFrame.setVisible(true);
    }


    private JButton createSmallButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.RED);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(0, 20));
        return button;
    }

    class ButtonListener implements ActionListener {
        private String pageName;
        private String pageText;
        private String subPage1Button1Text;
        private String subPage1Text1;
        private String subPage1Button2Text;
        private String subPage1Text2;

        ButtonListener(String pageName, String pageText, String subPage1Button1Text, String subPage1Text1, String subPage1Button2Text, String subPage1Text2) {
            this.pageName = pageName;
            this.pageText = pageText;
            this.subPage1Button1Text = subPage1Button1Text;
            this.subPage1Text1 = subPage1Text1;
            this.subPage1Button2Text = subPage1Button2Text;
            this.subPage1Text2 = subPage1Text2;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame.setVisible(false);
            openNewPage(pageName, pageText, subPage1Button1Text, subPage1Text1, subPage1Button2Text, subPage1Text2);
        }
    }

    class SmallButtonListener implements ActionListener {
        private String subPageButtonName;
        private String mainPageName;
        private String subPageText;

        SmallButtonListener(String subPageButtonName, String mainPageName, String subPageText) {
            this.subPageButtonName = subPageButtonName;
            this.mainPageName = mainPageName;
            this.subPageText = subPageText;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame.setVisible(false);
            openNewPage(subPageButtonName, subPageText, "", "", "", "");
        }
    }
}
