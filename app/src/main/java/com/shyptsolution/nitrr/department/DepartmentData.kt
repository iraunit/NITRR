package com.shyptsolution.nitrr.department

import com.shyptsolution.nitrr.R

object DepartmentData {
    var listofDepartment=ArrayList<Data>()


    init {
        listofDepartment.add(Data("Computer Science & Engineering",
            "Welcome to Computer Science & Engineering.",
            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
                "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
                    "National and International levels.\n" +
                "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
                "To conduct Research and Development and offer consultancy services.\n" +
                "To improve continuously the quality of teaching-learning process.\n" +
                "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
                "To empower the faculty and staff for overall development of students.",
            "Dr. Dilip Singh Sisodia\n" +
                "\n" +
                "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
                "\n" +
                "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
            "Dr. Naresh Kumar Nagwani\n" +
                "\n" +
                "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
                    "ac.in\tData Mining, Text Mining, Software Engineering",
            "Dr. Manu Vardhan\n" +
                "\n" +
                "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
            "Dr. Jitendra Kumar Rout\t\n" +
                " \n" +
                "\n" +
                " M.Tech., Ph.D.\t\n" +
                "Assistant Professor\n" +
                "Grade-II\n" +
                "\n" +
                " \n" +
                "\n" +
                "+91 9439622802\n" +
                "+91 7008153233\n" +
                "jitu2rout@gmail.com\n" +
                "jkrout.cs@nitrr.ac.in\n" +
                "\n" +
                "\n" +
                "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
                " ","Mr. Naveen Prakash Sharma\n" +
                    "\n" +
                    "Technical Assistant (SG-II)\n" +
                    "(M.Tech. CSE)\t\n" +
                    "9329127844\n" +
                    "npsharma.cs@nitrr.ac.in",
            "Ravi Shankar Pandey\n" +
                    "\n" +
                    "Lab Assistant\n" +
                    "(AMIE CSE)\t\n" +
                    "7222979848\n" +
                    "rpandey.cs@nitrr.ac.in",
            "data:image/jpeg;base64,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",
            "Year 2000",
        "B.Tech. (Comp. Sc. Engg.) - 114"
        , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
        ))


//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
//
//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
//
//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
//
//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
//
//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
//
//        listofDepartment.add(Data("Computer Science & Engineering",
//            "Welcome to Computer Science & Engineering.",
//            "To promote Research and Development in the frontier areas of Computer Science & Engineering.\n" +
//                    "To generate Competent Professionals to become part of the industry and Research Organizations at the " +
//                    "National and International levels.\n" +
//                    "To provide necessary strengths to enable the students to Innovate and to become Entrepreneurs.",
//            "To impart effective education at undergraduate levels in the field of Computer Science and Engineering\n" +
//                    "To conduct Research and Development and offer consultancy services.\n" +
//                    "To improve continuously the quality of teaching-learning process.\n" +
//                    "To strive steadily for the overall growth and development of intellect and personality of the students who, as professionals, would be confident to face the challenges of the world of work.\n" +
//                    "To empower the faculty and staff for overall development of students.",
//            "Dr. Dilip Singh Sisodia\n" +
//                    "\n" +
//                    "B.E.(CSE), M.Tech. (IT), Ph.D.(CSE)\n" +
//                    "\n" +
//                    "Assistant Professor\t8462808174 dssisodia.cs@nitrr.ac.in\tArtificial Intelligence, Machine Learning, Soft " +
//                    "Computing, Computational Intelligence, Biomedical Image/Signal Processing,Theoretical Computer Science",
//            "Dr. Naresh Kumar Nagwani\n" +
//                    "\n" +
//                    "B.E,M. Tech., Ph.D. (Computer Science & Engineering)\tAssociate Professor\t9993312001 nknagwani.cs@nitrr. " +
//                    "ac.in\tData Mining, Text Mining, Software Engineering",
//            "Dr. Manu Vardhan\n" +
//                    "\n" +
//                    "M.E., Ph.D. (Computer Science & Engineering)\tAssistant Professor\t9770543061 " +
//                    "mvardhan.cs@nitrr.ac.in\tDistributed System",
//            "Dr. Jitendra Kumar Rout\t\n" +
//                    " \n" +
//                    "\n" +
//                    " M.Tech., Ph.D.\t\n" +
//                    "Assistant Professor\n" +
//                    "Grade-II\n" +
//                    "\n" +
//                    " \n" +
//                    "\n" +
//                    "+91 9439622802\n" +
//                    "+91 7008153233\n" +
//                    "jitu2rout@gmail.com\n" +
//                    "jkrout.cs@nitrr.ac.in\n" +
//                    "\n" +
//                    "\n" +
//                    "NLP, AI and Machine Learning, Information Security, IoT, Theoretical Computer Science\n" +
//                    " ","Mr. Naveen Prakash Sharma\n" +
//                    "\n" +
//                    "Technical Assistant (SG-II)\n" +
//                    "(M.Tech. CSE)\t\n" +
//                    "9329127844\n" +
//                    "npsharma.cs@nitrr.ac.in",
//            "Ravi Shankar Pandey\n" +
//                    "\n" +
//                    "Lab Assistant\n" +
//                    "(AMIE CSE)\t\n" +
//                    "7222979848\n" +
//                    "rpandey.cs@nitrr.ac.in",
//            R.drawable.ic_gallery,
//            "Year 2000",
//            "B.Tech. (Comp. Sc. Engg.) - 114"
//            , "Bachelor of Technology (B.Tech.) in Computer Science & Engineering.",
//        ))
    }

}