package com.cj.freelanceapp;

import com.cj.freelanceapp.model.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FreelancerModuleTest implements Testable{
    @Override
    public void init() {

    }

    @Override
    public void insertTestData() {

        List<Skill> users = (List<Skill>) IntStream.range(1, 100)
                .mapToObj(e ->
                                Skill.builder()
//                                .feedbackDate(faker.date().birthday())
//                                .feedbackContent(faker.company().buzzword())
//                                .email(faker.internet().emailAddress())
//                                .password(faker.code().asin())
//                                .isActive(faker.bool().bool())
//                                .role(CUSTOMER.name())
//                                .rating(faker.number().numberBetween(1,10))
                                        .skillDescription(faker.company().catchPhrase())
                                        .skillCategory(faker.company().industry())
                                        .skillName(faker.company().profession())
                                        .build()
                ).toList();
        users.forEach(e ->
        {
            Skill u = (Skill) e;
            skillServiceImp.add_skill(u);
        });
    }

    private void loadSkills() {

        String[] s1 = {"data analysis ", "data science", "field gather interpret and evaluate data"};
        String[] s2 = {"writing and research ", "writer", "content writing copy writing and blogging"};

        String[] s3 = {"project management", "project manager", "Freelancers can track upcoming deadlines and " +
                "prioritize their projects according to the order in which they are due"};

        String[] s4 = {"accounting", "accountant", "analysing and maintaining records updating processes and " +
                "systems paying taxes and investigating fraud"};

        String[] s5 = {"consultancy", "consultants", "enhance overall " +
                "operations productivity profitability structures and strategies"};

        String[] s6 = {"photography", "photographer", "produce high quality evocative photos that capture a moment tell " +
                "a story or sell a product"};

        String[] s7 = {"videography", "videographer", "capture an idea scene or event via moving images "};

        String[] s8 = {"virtual assistant", "virtual assistant", "coordinates an employers daily" +
                "administrative duties via remote location"};

        String[] s9 = {"user experience Design", "UI Designer", "creating products that are easy  to  use and enhance " +
                "the visitors experience"};

        String[] s10 = {"ASP development", "ASP developer", "developers who can edit change or customize web pages using " +
                "the old school Active Server Pages since it runs parallel with HTML5"};

        String[] s11 = {"proofreading", "Proofreader", "reads copy and transcripts to make sure that there aren " +
                "t spelling grammatical or typographical errors"};


        String[] s12 = {"Animation", "Animator", "draw illustrations for games films television shows or commercials"};
        String[] s13 = {"Lead Generation", "Lead Generator", "prospecting qualifying and generating new sales leads " +
                " for brands and companies through mediums like email and social media"};
        String[] s14 = {"Data mining", "Data miner", "analyze big data"};


        String[] s15 = {"Video Editing", "Video editor", "look for errors add audio or graphics and make  sure that a " +
                "story matches the overall storyline"};

        String[] s16 = {"Data visualization", "Data visualizer", "help people understand this information by " +
                " converting into visual content"};

        String[] s17 = {"3D Design", "3D designer", "3D designing and 3D printing"};

        String[] s18 = {"Administrative assistance", "Administrative assistant", "managing things that usually take place " +
                " in an office except now it all happens online"};
        String[] s19 = {"Automation", "Automation specialist ", "develop programs that streamline and automate " +
                "processes to achieve outcomes with minimal human input helping companies reduce costs"};

        String[] s20 = {"Virtual reality ", "Virtual reality developer", "create and test VR and AR augmented reality " +
                "    applications that offer a simulated user experience"};

        String[] s21 = {"ServiceNow", "ServiceNow Developer", "use cloud based platform to design develop and " +
                "implement digital workflows and applications that connect people functions and systems across an organization"};

        String[] s22 = {"DaVinchi Resolve", "DaVinchi Resolve video editor", "pecialists to combine editing color " +
                "correction motion graphics visual effects and audio post production"};


        String[] s23 = {"statistical modeling", "Statistical modeling expert", "use mathematical models and " +
                "statistical assumptions to generate sample data and conduct analysis"};

        String[] s24 = {"Relational databases", "Relational database specialist", "use tools to organize data into " +
                "tables linked related based on common data"};

        String[] s25 = {"Motion graphics", "Motion graphics designer", "put otherwise static graphic designs such " +
                "as info graphics in motion(animation or movement"};

        String[] s26 = {"Packaging Design", "Packaging designer", "create product packaging focusing on how it appears " +
                "to customers who might purchase the product focusing" +
                "on form structure color materials typography imagery and regulatory information along with ancillary" +
                "design elements to make a product suitable for marketing"};

        String[] s27 = {"Microsoft Azure", "Microsoft Azure specialist", "use this public cloud computing platform for " +
                "services such as analytics virtual computing storage and networking supporting solutions for cloud  based" +
                "services such as IaaS"};

//
//        String[] s1 = {"Graphics and designing", "Designer", SkillCategory.Graphic_Design.name()};
//        String[] s2 = {"Photography_and_Editing", "Photography_and_Editing", SkillCategory.Photography_and_Editing.name()};
//        String[] s3 = {"Blockchain", "Blockchain", SkillCategory.Blockchain.name()};
//        String[] s4 = {"Excel_Accounting", "Excel_Accounting", SkillCategory.Excel_Accounting.name()};
//        String[] s5 = {"Search_Engine_Optimization", "Search_Engine_Optimization", SkillCategory.Search_Engine_Optimization.name()};
//        String[] s6 = {"Social_Media_Marketing", "Social_Media_Marketing", SkillCategory.Social_Media_Marketing.name()};
//        String[] s7 = {"Web_Designing_and_Developing", "Web_Designing_and_Developing", SkillCategory.Web_Designing_and_Developing.name()};
//        String[] s8 = {"Writing_Editing_and_Rephrasing", "Writing_Editing_and_Rephrasing", SkillCategory.Writing_Editing_and_Rephrasing.name()};
//        String[] s9 = {"Graphics and designing","Designer", SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};
//        String[] s1 = {"Graphics and designing","Designer",SkillCategory.Graphic_Design.name()};

        List list = new ArrayList<String[]>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        list.add(s14);
        list.add(s15);
        list.add(s16);
        list.add(s17);
        list.add(s18);
        list.add(s19);
        list.add(s20);
        list.add(s21);
        list.add(s22);
        list.add(s23);
        list.add(s24);
        list.add(s25);
        list.add(s26);
        list.add(s27);
        list.forEach(e -> {
            String[] strings = (String[]) e;
            Skill skill = Skill
                    .builder()
                    .skillName(strings[0])
                    .skillCategory(strings[1])
                    .skillDescription(strings[2])
                    .build();
            skillServiceImp.add_skill(skill);
        });

    }

    @Override
    public void retrieveTestData() {

    }

    @Override
    public void removeTestData() {

    }
}
