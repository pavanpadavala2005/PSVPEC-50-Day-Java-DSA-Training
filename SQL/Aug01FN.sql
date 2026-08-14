
	ht_number int primary key,
    name varchar(20) not null,
    gender char,
    dob date,
    email varchar(35),
    phone_number varchar(10),
    cgpa float,
    attendance_percentage int,
    dept_id int,
    dept_name varchar(20),
    yop int,create table student(
    academic_fee int,
    blood_group char(3),
    college_name varchar(20),
    pin_code int(6),
    nationality varchar(20),
    state varchar(20) 
);


INSERT INTO student (ht_number, name, gender, dob, email, phone_number, cgpa, attendance_percentage, dept_id, dept_name, yop, academic_fee, blood_group, college_name, pin_code, nationality, state) 
VALUES 
-- Block 1: CSE Students (Indian - Tamil Nadu)
(1001, 'Aarav Kumar', 'M', '2003-01-15', 'aarav.k@gmail.com', '9876543001', 8.5, 88, 302, 'CSE', 2025, 200000, 'O+', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1002, 'Diya Raj', 'F', '2004-02-20', 'diya.r@gmail.com', '9876543002', 9.1, 75, 302, 'CSE', 2026, 210000, 'B+', 'CEG', 600025, 'Indian', 'Tamil Nadu'),
(1003, 'Karthik Natarajan', 'M', '2002-05-10', 'karthik.n@yahoo.com', '9876543003', 7.5, 45, 302, 'CSE', 2024, 200000, 'A+', 'MIT', 600044, 'Indian', 'Tamil Nadu'),
(1004, 'Swathi Mohan', 'F', '2003-08-11', 'swathi.m@gmail.com', '9876543004', 8.5, 88, 302, 'CSE', 2025, 220000, 'O-', 'SRM', 603203, 'Indian', 'Tamil Nadu'),
(1005, 'Arjun Vijay', 'M', '2005-11-22', 'arjun.v@outlook.com', '9876543005', 6.8, 55, 302, 'CSE', 2027, 190000, 'AB+', 'VIT', 632014, 'Indian', 'Tamil Nadu'),
(1006, 'Pooja Iyer', 'F', '2004-12-05', 'pooja.i@gmail.com', '9876543006', 9.4, 90, 302, 'CSE', 2026, 200000, 'B-', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1007, 'Sanjay Ram', 'M', '2006-03-14', 'sanjay.r@gmail.com', '9876543007', 7.2, 68, 302, 'CSE', 2028, 180000, 'O+', 'KCG', 600097, 'Indian', 'Tamil Nadu'),
(1008, 'Lakshmi K', 'F', '2003-07-19', 'lakshmi.k@gmail.com', '9876543008', 8.1, 78, 302, 'CSE', 2025, 175000, 'A-', 'PERI', 600126, 'Indian', 'Tamil Nadu'),
(1009, 'Vignesh S', 'M', '2002-09-30', 'vignesh.s@yahoo.com', '9876543009', 5.9, 35, 302, 'CSE', 2024, 160000, 'O+', 'CIT', 600069, 'Indian', 'Tamil Nadu'),
(1010, 'Nithya R', 'F', '2007-04-12', 'nithya.r@gmail.com', '9876543010', 8.5, 88, 302, 'CSE', 2029, 200000, 'AB-', 'GNC', 600042, 'Indian', 'Tamil Nadu'),

-- Block 2: MECH Students (Indian - Maharashtra & Gujarat)
(1011, 'Rohan Sharma', 'M', '2003-01-21', 'rohan.s@gmail.com', '9765432011', 7.2, 68, 301, 'MECH', 2025, 150000, 'O+', 'PDKV', 400001, 'Indian', 'Maharashtra'),
(1012, 'Aditi Joshi', 'F', '2004-05-16', 'aditi.j@yahoo.com', '9765432012', 8.8, 78, 301, 'MECH', 2026, 150000, 'A+', 'PDKV', 400001, 'Indian', 'Maharashtra'),
(1013, 'Vedant Patil', 'M', '2002-10-10', 'vedant.p@gmail.com', '9765432013', 6.5, 45, 301, 'MECH', 2024, 140000, 'B+', 'PDKV', 400001, 'Indian', 'Maharashtra'),
(1014, 'Neha Deshmukh', 'F', '2005-12-08', 'neha.d@gmail.com', '9765432014', 9.0, 85, 301, 'MECH', 2027, 160000, 'O-', 'PDKV', 400001, 'Indian', 'Maharashtra'),
(1015, 'Pranav Kadam', 'M', '2006-02-14', 'pranav.k@outlook.com', '9765432015', 7.2, 55, 301, 'MECH', 2028, 150000, 'A-', 'PDKV', 400001, 'Indian', 'Maharashtra'),
(1016, 'Harsh Patel', 'M', '2003-08-22', 'harsh.p@gmail.com', '9654321016', 8.1, 75, 301, 'MECH', 2025, 155000, 'O+', 'PSVPCE', 380001, 'Indian', 'Gujarat'),
(1017, 'Isha Shah', 'F', '2004-11-30', 'isha.s@gmail.com', '9654321017', 7.5, 62, 301, 'MECH', 2026, 155000, 'B-', 'PSVPCE', 380001, 'Indian', 'Gujarat'),
(1018, 'Dev Mehta', 'M', '2002-04-18', 'dev.m@yahoo.com', '9654321018', 6.5, 40, 301, 'MECH', 2024, 150000, 'AB+', 'PSVPCE', 380001, 'Indian', 'Gujarat'),
(1019, 'Mira Desai', 'F', '2005-07-25', 'mira.d@gmail.com', '9654321019', 8.5, 88, 301, 'MECH', 2027, 160000, 'O+', 'PSVPCE', 380001, 'Indian', 'Gujarat'),
(1020, 'Karan Bhatt', 'M', '2007-09-12', 'karan.b@gmail.com', '9654321020', 7.8, 68, 301, 'MECH', 2029, 155000, 'A+', 'PSVPCE', 380001, 'Indian', 'Gujarat'),

-- Block 3: ECE Students (Foreign - USA & Canada)
(1021, 'Michael Smith', 'M', '2003-03-10', 'michael.s@gmail.com', '1202555021', 9.1, 85, 303, 'ECE', 2025, 350000, 'O+', 'VIT', 902100, 'American', 'California'),
(1022, 'Emily Davis', 'F', '2004-06-15', 'emily.d@yahoo.com', '1202555022', 8.5, 75, 303, 'ECE', 2026, 350000, 'A+', 'SRM', 902100, 'American', 'California'),
(1023, 'James Wilson', 'M', '2002-12-05', 'james.w@gmail.com', '1202555023', 7.5, 55, 303, 'ECE', 2024, 340000, 'B+', 'SSN', 902100, 'American', 'California'),
(1024, 'Olivia Taylor', 'F', '2005-02-28', 'olivia.t@outlook.com', '1202555024', 9.5, 90, 303, 'ECE', 2027, 360000, 'O-', 'MIT', 902100, 'American', 'California'),
(1025, 'William Brown', 'M', '2006-09-19', 'william.b@gmail.com', '1202555025', 7.2, 45, 303, 'ECE', 2028, 350000, 'AB+', 'CEG', 902100, 'American', 'California'),
(1026, 'Sophia Miller', 'F', '2003-11-22', 'sophia.m@gmail.com', '1416555026', 8.8, 88, 303, 'ECE', 2025, 330000, 'A-', 'VIT', 802100, 'Canadian', 'Ontario'),
(1027, 'Benjamin Moore', 'M', '2004-04-14', 'benjamin.m@yahoo.com', '1416555027', 8.1, 68, 303, 'ECE', 2026, 330000, 'O+', 'SRM', 802100, 'Canadian', 'Ontario'),
(1028, 'Isabella White', 'F', '2002-08-30', 'isabella.w@gmail.com', '1416555028', 7.5, 55, 303, 'ECE', 2024, 320000, 'B-', 'SSN', 802100, 'Canadian', 'Ontario'),
(1029, 'Lucas Harris', 'M', '2005-05-11', 'lucas.h@gmail.com', '1416555029', 9.1, 78, 303, 'ECE', 2027, 340000, 'AB-', 'MIT', 802100, 'Canadian', 'Ontario'),
(1030, 'Mia Martin', 'F', '2007-01-25', 'mia.m@outlook.com', '1416555030', 8.5, 75, 303, 'ECE', 2029, 330000, 'O+', 'CEG', 802100, 'Canadian', 'Ontario'),

-- Block 4: CIVIL Students (Indian - Karnataka & Telangana)
(1031, 'Rahul Gowda', 'M', '2003-02-18', 'rahul.g@gmail.com', '9543210031', 7.2, 68, 304, 'CIVIL', 2025, 140000, 'O+', 'CIT', 560001, 'Indian', 'Karnataka'),
(1032, 'Ananya Rao', 'F', '2004-07-22', 'ananya.r@yahoo.com', '9543210032', 8.5, 88, 304, 'CIVIL', 2026, 145000, 'B+', 'PERI', 560001, 'Indian', 'Karnataka'),
(1033, 'Kiran Kumar', 'M', '2002-11-05', 'kiran.k@gmail.com', '9543210033', 6.5, 45, 304, 'CIVIL', 2024, 135000, 'A+', 'GNC', 560001, 'Indian', 'Karnataka'),
(1034, 'Shreya Shetty', 'F', '2005-09-14', 'shreya.s@gmail.com', '9543210034', 9.1, 85, 304, 'CIVIL', 2027, 150000, 'O-', 'CIT', 560001, 'Indian', 'Karnataka'),
(1035, 'Naveen Bhat', 'M', '2006-12-01', 'naveen.b@outlook.com', '9543210035', 7.8, 55, 304, 'CIVIL', 2028, 140000, 'AB+', 'PERI', 560001, 'Indian', 'Karnataka'),
(1036, 'Tarun Reddy', 'M', '2003-04-10', 'tarun.r@gmail.com', '9432100036', 8.1, 75, 304, 'CIVIL', 2025, 140000, 'A-', 'GNC', 500001, 'Indian', 'Telangana'),
(1037, 'Keerthi Das', 'F', '2004-08-25', 'keerthi.d@gmail.com', '9432100037', 7.5, 62, 304, 'CIVIL', 2026, 145000, 'O+', 'CIT', 500001, 'Indian', 'Telangana'),
(1038, 'Akhil Sharma', 'M', '2002-01-30', 'akhil.s@yahoo.com', '9432100038', 6.5, 40, 304, 'CIVIL', 2024, 135000, 'B-', 'PERI', 500001, 'Indian', 'Telangana'),
(1039, 'Sanjana G', 'F', '2005-03-12', 'sanjana.g@gmail.com', '9432100039', 8.5, 88, 304, 'CIVIL', 2027, 150000, 'O+', 'GNC', 500001, 'Indian', 'Telangana'),
(1040, 'Manoj V', 'M', '2007-06-18', 'manoj.v@gmail.com', '9432100040', 7.2, 68, 304, 'CIVIL', 2029, 140000, 'AB-', 'CIT', 500001, 'Indian', 'Telangana'),

-- Block 5: IT Students (Foreign - UK & Australia)
(1041, 'George Evans', 'M', '2003-05-14', 'george.e@gmail.com', '4420712341', 8.5, 88, 305, 'IT', 2025, 360000, 'O+', 'VIT', 100001, 'British', 'London'),
(1042, 'Charlotte King', 'F', '2004-10-21', 'charlotte.k@yahoo.com', '4420712342', 9.1, 85, 305, 'IT', 2026, 370000, 'A+', 'SSN', 100001, 'British', 'London'),
(1043, 'Harry Wright', 'M', '2002-02-08', 'harry.w@gmail.com', '4420712343', 7.5, 55, 305, 'IT', 2024, 350000, 'B+', 'SRM', 100001, 'British', 'London'),
(1044, 'Amelia Scott', 'F', '2005-07-30', 'amelia.s@outlook.com', '4420712344', 9.5, 90, 305, 'IT', 2027, 380000, 'O-', 'MIT', 100001, 'British', 'London'),
(1045, 'Jack Green', 'M', '2006-11-12', 'jack.g@gmail.com', '4420712345', 7.2, 68, 305, 'IT', 2028, 360000, 'AB+', 'CEG', 100001, 'British', 'London'),
(1046, 'Oliver Thomas', 'M', '2003-09-05', 'oliver.t@gmail.com', '6129876046', 8.8, 78, 305, 'IT', 2025, 340000, 'A-', 'VIT', 200000, 'Australian', 'NSW'),
(1047, 'Ava Jackson', 'F', '2004-12-18', 'ava.j@yahoo.com', '6129876047', 8.1, 75, 305, 'IT', 2026, 350000, 'O+', 'SSN', 200000, 'Australian', 'NSW'),
(1048, 'Noah White', 'M', '2002-03-25', 'noah.w@gmail.com', '6129876048', 6.5, 45, 305, 'IT', 2024, 330000, 'B-', 'SRM', 200000, 'Australian', 'NSW'),
(1049, 'Chloe Harris', 'F', '2005-08-09', 'chloe.h@gmail.com', '6129876049', 9.1, 85, 305, 'IT', 2027, 360000, 'O+', 'MIT', 200000, 'Australian', 'NSW'),
(1050, 'Ethan Martin', 'M', '2007-02-14', 'ethan.m@outlook.com', '6129876050', 7.8, 68, 305, 'IT', 2029, 340000, 'AB-', 'CEG', 200000, 'Australian', 'NSW'),

-- Block 6: Mixed Depts (Indian - Delhi & Kerala)
(1051, 'Aryan Singh', 'M', '2003-06-20', 'aryan.s@gmail.com', '9321000051', 8.5, 88, 302, 'CSE', 2025, 210000, 'O+', 'VIT', 110001, 'Indian', 'Delhi'),
(1052, 'Kavya Sharma', 'F', '2004-01-11', 'kavya.s@yahoo.com', '9321000052', 9.1, 75, 303, 'ECE', 2026, 200000, 'B+', 'SRM', 110001, 'Indian', 'Delhi'),h
(1053, 'Rishabh Verma', 'M', '2002-09-05', 'rishabh.v@gmail.com', '9321000053', 7.5, 55, 301, 'MECH', 2024, 150000, 'A+', 'MIT', 110001, 'Indian', 'Delhi'),
(1054, 'Sneha Kapoor', 'F', '2005-04-18', 'sneha.k@gmail.com', '9321000054', 8.8, 85, 305, 'IT', 2027, 215000, 'O-', 'SSN', 110001, 'Indian', 'Delhi'),
(1055, 'Rohan Gupta', 'M', '2006-10-22', 'rohan.g@outlook.com', '9321000055', 7.2, 68, 304, 'CIVIL', 2028, 140000, 'AB+', 'CEG', 110001, 'Indian', 'Delhi'),
(1056, 'Abhinav Nair', 'M', '2003-12-15', 'abhinav.n@gmail.com', '9210000056', 8.1, 78, 302, 'CSE', 2025, 205000, 'A-', 'KCG', 682001, 'Indian', 'Kerala'),
(1057, 'Meenakshi Menon', 'F', '2004-05-30', 'meenakshi.m@gmail.com', '9210000057', 9.5, 90, 303, 'ECE', 2026, 195000, 'O+', 'PERI', 682001, 'Indian', 'Kerala'),
(1058, 'Vishnu Prasad', 'M', '2002-08-14', 'vishnu.p@yahoo.com', '9210000058', 6.5, 45, 301, 'MECH', 2024, 145000, 'B-', 'GNC', 682001, 'Indian', 'Kerala'),
(1059, 'Anjali Pillai', 'F', '2005-11-09', 'anjali.p@gmail.com', '9210000059', 8.5, 88, 305, 'IT', 2027, 210000, 'O+', 'CIT', 682001, 'Indian', 'Kerala'),
(1060, 'Gautham K', 'M', '2007-03-25', 'gautham.k@gmail.com', '9210000060', 7.8, 68, 304, 'CIVIL', 2029, 145000, 'AB-', 'PDKV', 682001, 'Indian', 'Kerala'),

-- Block 7: Repeated Names / Different Data (Indian - Tamil Nadu)
(1061, 'Rahul Sharma', 'M', '2003-02-10', 'rahul.s2@gmail.com', '9100000061', 8.5, 88, 303, 'ECE', 2025, 180000, 'O+', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1062, 'Priya Singh', 'F', '2004-06-25', 'priya.s2@yahoo.com', '9100000062', 9.1, 85, 302, 'CSE', 2026, 200000, 'A+', 'CEG', 600025, 'Indian', 'Tamil Nadu'),
(1063, 'Karthik Raja', 'M', '2002-11-15', 'karthik.r2@gmail.com', '9100000063', 7.5, 55, 305, 'IT', 2024, 190000, 'B+', 'MIT', 600044, 'Indian', 'Tamil Nadu'),
(1064, 'Swathi Mohan', 'F', '2005-01-30', 'swathi.m2@gmail.com', '9100000064', 8.8, 75, 304, 'CIVIL', 2027, 130000, 'O-', 'SRM', 603203, 'Indian', 'Tamil Nadu'),
(1065, 'Arjun Vijay', 'M', '2006-08-12', 'arjun.v2@outlook.com', '9100000065', 7.2, 68, 301, 'MECH', 2028, 150000, 'AB+', 'VIT', 632014, 'Indian', 'Tamil Nadu'),
(1066, 'Pooja Iyer', 'F', '2003-04-18', 'pooja.i2@gmail.com', '9000000066', 8.1, 78, 302, 'CSE', 2025, 200000, 'A-', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1067, 'Sanjay Ram', 'M', '2004-09-05', 'sanjay.r2@gmail.com', '9000000067', 9.5, 90, 303, 'ECE', 2026, 185000, 'O+', 'KCG', 600097, 'Indian', 'Tamil Nadu'),
(1068, 'Lakshmi K', 'F', '2002-12-22', 'lakshmi.k2@yahoo.com', '9000000068', 6.5, 45, 305, 'IT', 2024, 190000, 'B-', 'PERI', 600126, 'Indian', 'Tamil Nadu'),
(1069, 'Vignesh S', 'M', '2005-05-14', 'vignesh.s2@gmail.com', '9000000069', 8.5, 88, 304, 'CIVIL', 2027, 135000, 'O+', 'CIT', 600069, 'Indian', 'Tamil Nadu'),
(1070, 'Nithya R', 'F', '2007-10-30', 'nithya.r2@gmail.com', '9000000070', 7.8, 68, 301, 'MECH', 2029, 155000, 'AB-', 'GNC', 600042, 'Indian', 'Tamil Nadu'),

-- Block 8: Mixed (Foreign - Germany & France)
(1071, 'Lukas Schmidt', 'M', '2003-07-11', 'lukas.s@gmail.com', '4915200071', 8.5, 88, 302, 'CSE', 2025, 380000, 'O+', 'VIT', 101150, 'German', 'Berlin'),
(1072, 'Hannah Becker', 'F', '2004-02-28', 'hannah.b@yahoo.com', '4915200072', 9.1, 85, 303, 'ECE', 2026, 360000, 'B+', 'SRM', 101150, 'German', 'Berlin'),
(1073, 'Felix Wagner', 'M', '2002-11-09', 'felix.w@gmail.com', '4915200073', 7.5, 55, 301, 'MECH', 2024, 340000, 'A+', 'MIT', 101150, 'German', 'Berlin'),
(1074, 'Laura Hoffmann', 'F', '2005-04-16', 'laura.h@outlook.com', '4915200074', 8.8, 75, 305, 'IT', 2027, 390000, 'O-', 'SSN', 101150, 'German', 'Berlin'),
(1075, 'Julian Koch', 'M', '2006-08-25', 'julian.k@gmail.com', '4915200075', 7.2, 68, 304, 'CIVIL', 2028, 330000, 'AB+', 'CEG', 101150, 'German', 'Berlin'),
(1076, 'Hugo Bernard', 'M', '2003-01-18', 'hugo.b@gmail.com', '3361200076', 8.1, 78, 302, 'CSE', 2025, 370000, 'A-', 'VIT', 750010, 'French', 'IDF'),
(1077, 'Alice Dubois', 'F', '2004-06-05', 'alice.d@gmail.com', '3361200077', 9.5, 90, 303, 'ECE', 2026, 350000, 'O+', 'SRM', 750010, 'French', 'IDF'),
(1078, 'Leo Thomas', 'M', '2002-12-14', 'leo.t@yahoo.com', '3361200078', 6.5, 45, 301, 'MECH', 2024, 330000, 'B-', 'MIT', 750010, 'French', 'IDF'),
(1079, 'Emma Robert', 'F', '2005-09-22', 'emma.r@gmail.com', '3361200079', 8.5, 88, 305, 'IT', 2027, 380000, 'O+', 'SSN', 750010, 'French', 'IDF'),
(1080, 'Louis Richard', 'M', '2007-03-30', 'louis.r@gmail.com', '3361200080', 7.8, 68, 304, 'CIVIL', 2029, 320000, 'AB-', 'CEG', 750010, 'French', 'IDF'),

-- Block 9: More CSE & IT (Indian - Tamil Nadu)
(1081, 'Varun Krishnan', 'M', '2003-05-10', 'varun.k@gmail.com', '8900000081', 8.5, 88, 302, 'CSE', 2025, 205000, 'O+', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1082, 'Deepa G', 'F', '2004-10-15', 'deepa.g@yahoo.com', '8900000082', 9.1, 85, 305, 'IT', 2026, 215000, 'B+', 'CEG', 600025, 'Indian', 'Tamil Nadu'),
(1083, 'Ravi Teja', 'M', '2002-02-28', 'ravi.t@gmail.com', '8900000083', 7.5, 55, 302, 'CSE', 2024, 200000, 'A+', 'MIT', 600044, 'Indian', 'Tamil Nadu'),
(1084, 'Shalini V', 'F', '2005-07-12', 'shalini.v@gmail.com', '8900000084', 8.8, 75, 305, 'IT', 2027, 220000, 'O-', 'SRM', 603203, 'Indian', 'Tamil Nadu'),
(1085, 'Dinesh Kumar', 'M', '2006-12-05', 'dinesh.k@outlook.com', '8900000085', 7.2, 68, 302, 'CSE', 2028, 195000, 'AB+', 'VIT', 632014, 'Indian', 'Tamil Nadu'),
(1086, 'Kavitha M', 'F', '2003-08-20', 'kavitha.m@gmail.com', '8800000086', 8.1, 78, 305, 'IT', 2025, 210000, 'A-', 'SSN', 600119, 'Indian', 'Tamil Nadu'),
(1087, 'Prashanth S', 'M', '2004-01-25', 'prashanth.s@gmail.com', '8800000087', 9.5, 90, 302, 'CSE', 2026, 205000, 'O+', 'KCG', 600097, 'Indian', 'Tamil Nadu'),
(1088, 'Anusuya R', 'F', '2002-04-14', 'anusuya.r@yahoo.com', '8800000088', 6.5, 45, 305, 'IT', 2024, 200000, 'B-', 'PERI', 600126, 'Indian', 'Tamil Nadu'),
(1089, 'Madhavan C', 'M', '2005-09-30', 'madhavan.c@gmail.com', '8800000089', 8.5, 88, 302, 'CSE', 2027, 190000, 'O+', 'CIT', 600069, 'Indian', 'Tamil Nadu'),
(1090, 'Gayathri P', 'F', '2007-02-18', 'gayathri.p@gmail.com', '8800000090', 7.8, 68, 305, 'IT', 2029, 210000, 'AB-', 'GNC', 600042, 'Indian', 'Tamil Nadu'),

-- Block 10: More CIVIL & MECH (Indian - Andhra Pradesh)
(1091, 'Sai Ram', 'M', '2003-04-22', 'sai.r@gmail.com', '8700000091', 8.5, 88, 304, 'CIVIL', 2025, 140000, 'O+', 'VIT', 520001, 'Indian', 'Andhra Pradesh'),
(1092, 'Bhavya Sri', 'F', '2004-11-05', 'bhavya.s@yahoo.com', '8700000092', 9.1, 85, 301, 'MECH', 2026, 150000, 'B+', 'SRM', 520001, 'Indian', 'Andhra Pradesh'),
(1093, 'Venkatesh K', 'M', '2002-07-16', 'venkatesh.k@gmail.com', '8700000093', 7.5, 55, 304, 'CIVIL', 2024, 135000, 'A+', 'MIT', 520001, 'Indian', 'Andhra Pradesh'),
(1094, 'Harika M', 'F', '2005-02-28', 'harika.m@gmail.com', '8700000094', 8.8, 75, 301, 'MECH', 2027, 155000, 'O-', 'SSN', 520001, 'Indian', 'Andhra Pradesh'),
(1095, 'Kalyan Babu', 'M', '2006-08-10', 'kalyan.b@outlook.com', '8700000095', 7.2, 68, 304, 'CIVIL', 2028, 140000, 'AB+', 'CEG', 520001, 'Indian', 'Andhra Pradesh'),
(1096, 'Mahesh D', 'M', '2003-12-25', 'mahesh.d@gmail.com', '8600000096', 8.1, 78, 301, 'MECH', 2025, 145000, 'A-', 'KCG', 520001, 'Indian', 'Andhra Pradesh'),
(1097, 'Swetha P', 'F', '2004-05-14', 'swetha.p@gmail.com', '8600000097', 9.5, 90, 304, 'CIVIL', 2026, 145000, 'O+', 'PERI', 520001, 'Indian', 'Andhra Pradesh'),
(1098, 'Rakesh G', 'M', '2002-10-30', 'rakesh.g@yahoo.com', '8600000098', 6.5, 45, 301, 'MECH', 2024, 140000, 'B-', 'GNC', 520001, 'Indian', 'Andhra Pradesh'),
(1099, 'Sindhu J', 'F', '2005-03-21', 'sindhu.j@gmail.com', '8600000099', 8.5, 88, 304, 'CIVIL', 2027, 145000, 'O+', 'CIT', 520001, 'Indian', 'Andhra Pradesh'),
(1100, 'Charan N', 'M', '2007-09-08', 'charan.n@gmail.com', '8600000100', 7.8, 68, 301, 'MECH', 2029, 150000, 'AB-', 'PDKV', 520001, 'Indian', 'Andhra Pradesh'),

-- Block 11: ECE Students (Indian - Various States)
(1101, 'Aman Verma', 'M', '2003-02-14', 'aman.v@gmail.com', '8500000101', 8.5, 88, 303, 'ECE', 2025, 180000, 'O+', 'VIT', 226001, 'Indian', 'Uttar Pradesh'),
(1102, 'Riya Sen', 'F', '2004-07-28', 'riya.s@yahoo.com', '8500000102', 9.1, 85, 303, 'ECE', 2026, 185000, 'B+', 'SRM', 700001, 'Indian', 'West Bengal'),
(1103, 'Vikram Das', 'M', '2002-11-19', 'vikram.d@gmail.com', '8500000103', 7.5, 55, 303, 'ECE', 2024, 175000, 'A+', 'MIT', 751001, 'Indian', 'Odisha'),
(1104, 'Sonali K', 'F', '2005-04-10', 'sonali.k@gmail.com', '8500000104', 8.8, 75, 303, 'ECE', 2027, 190000, 'O-', 'SSN', 800001, 'Indian', 'Bihar'),
(1105, 'Kunal Singh', 'M', '2006-09-22', 'kunal.s@outlook.com', '8500000105', 7.2, 68, 303, 'ECE', 2028, 180000, 'AB+', 'CEG', 302001, 'Indian', 'Rajasthan'),
(1106, 'Pawan M', 'M', '2003-12-05', 'pawan.m@gmail.com', '8400000106', 8.1, 78, 303, 'ECE', 2025, 185000, 'A-', 'KCG', 462001, 'Indian', 'Madhya Pradesh'),
(1107, 'Anita R', 'F', '2004-05-18', 'anita.r@gmail.com', '8400000107', 9.5, 90, 303, 'ECE', 2026, 180000, 'O+', 'PERI', 143001, 'Indian', 'Punjab'),
(1108, 'Rajat K', 'M', '2002-08-30', 'rajat.k@yahoo.com', '8400000108', 6.5, 45, 303, 'ECE', 2024, 170000, 'B-', 'GNC', 171001, 'Indian', 'Himachal'),
(1109, 'Nikita S', 'F', '2005-01-14', 'nikita.s@gmail.com', '8400000109', 8.5, 88, 303, 'ECE', 2027, 185000, 'O+', 'CIT', 781001, 'Indian', 'Assam'),
(1110, 'Sameer P', 'M', '2007-06-25', 'sameer.p@gmail.com', '8400000110', 7.8, 68, 303, 'ECE', 2029, 180000, 'AB-', 'PDKV', 492001, 'Indian', 'Chhattisgarh'),

-- Block 12: More Foreigners (Mixed Nationalities)
(1111, 'Kenji Sato', 'M', '2003-03-12', 'kenji.s@gmail.com', '8190000111', 8.5, 88, 302, 'CSE', 2025, 400000, 'O+', 'VIT', 100000, 'Japanese', 'Tokyo'),
(1112, 'Yuki Takahashi', 'F', '2004-08-20', 'yuki.t@yahoo.com', '8190000112', 9.1, 85, 303, 'ECE', 2026, 380000, 'B+', 'SRM', 100000, 'Japanese', 'Tokyo'),
(1113, 'Min-jun Kim', 'M', '2002-12-05', 'minjun.k@gmail.com', '8220000113', 7.5, 55, 305, 'IT', 2024, 390000, 'A+', 'MIT', 060000, 'South Korean', 'Seoul'),
(1114, 'Seo-yeon Lee', 'F', '2005-04-18', 'seoyeon.l@gmail.com', '8220000114', 8.8, 75, 302, 'CSE', 2027, 410000, 'O-', 'SSN', 060000, 'South Korean', 'Seoul'),
(1115, 'Wei Chen', 'M', '2006-09-30', 'wei.c@outlook.com', '8610000115', 7.2, 68, 301, 'MECH', 2028, 350000, 'AB+', 'CEG', 100000, 'Chinese', 'Beijing'),
(1116, 'Jing Wang', 'F', '2003-01-14', 'jing.w@gmail.com', '8610000116', 8.1, 78, 304, 'CIVIL', 2025, 340000, 'A-', 'VIT', 100000, 'Chinese', 'Beijing'),
(1117, 'Mateo Garcia', 'M', '2004-06-25', 'mateo.g@gmail.com', '3490000117', 9.5, 90, 303, 'ECE', 2026, 360000, 'O+', 'SRM', 280010, 'Spanish', 'Madrid'),
(1118, 'Sofia Martinez', 'F', '2002-11-10', 'sofia.m@yahoo.com', '3490000118', 6.5, 45, 305, 'IT', 2024, 370000, 'B-', 'SSN', 280010, 'Spanish', 'Madrid'),
(1119, 'Luca Rossi', 'M', '2005-02-22', 'luca.r@gmail.com', '3960000119', 8.5, 88, 302, 'CSE', 2027, 390000, 'O+', 'MIT', 001000, 'Italian', 'Lazio'),
(1120, 'Giulia Bianchi', 'F', '2007-07-15', 'giulia.b@gmail.com', '3960000120', 7.8, 68, 301, 'MECH', 2029, 350000, 'AB-', 'CEG', 001000, 'Italian', 'Lazio'),

-- Block 13: Final mixed batch 1 (Indian - Tamil Nadu mostly)
(1121, 'Harish K', 'M', '2003-05-18', 'harish.k@gmail.com', '7900000121', 8.5, 88, 301, 'MECH', 2025, 150000, 'O+', 'PSVPCE', 600119, 'Indian', 'Tamil Nadu'),
(1122, 'Nandini P', 'F', '2004-10-22', 'nandini.p@yahoo.com', '7900000122', 9.1, 85, 302, 'CSE', 2026, 200000, 'B+', 'PDKV', 600025, 'Indian', 'Tamil Nadu'),  
(1123, 'Pradeep M', 'M', '2002-03-05', 'pradeep.m@gmail.com', '7900000123', 7.5, 55, 303, 'ECE', 2024, 180000, 'A+', 'CIT', 600044, 'Indian', 'Tamil Nadu'),
(1124, 'Roshni S', 'F', '2005-08-14', 'roshni.s@gmail.com', '7900000124', 8.8, 75, 304, 'CIVIL', 2027, 140000, 'O-', 'VIT', 603203, 'Indian', 'Tamil Nadu'),
(1125, 'Kishore V', 'M', '2006-01-30', 'kishore.v@outlook.com', '7900000125', 7.2, 68, 305, 'IT', 2028, 210000, 'AB+', 'SSN', 632014, 'Indian', 'Tamil Nadu'),
(1126, 'Saranya R', 'F', '2003-06-12', 'saranya.r@gmail.com', '7800000126', 8.1, 78, 301, 'MECH', 2025, 155000, 'A-', 'SRM', 600097, 'Indian', 'Tamil Nadu'),
(1127, 'Bala C', 'M', '2004-11-25', 'bala.c@gmail.com', '7800000127', 9.5, 90, 302, 'CSE', 2026, 205000, 'O+', 'MIT', 600126, 'Indian', 'Tamil Nadu'),
(1128, 'Preethi N', 'F', '2002-04-10', 'preethi.n@yahoo.com', '7800000128', 6.5, 45, 303, 'ECE', 2024, 175000, 'B-', 'CEG', 600069, 'Indian', 'Tamil Nadu'),
(1129, 'Gokul D', 'M', '2005-09-21', 'gokul.d@gmail.com', '7800000129', 8.5, 88, 304, 'CIVIL', 2027, 145000, 'O+', 'KCG', 600042, 'Indian', 'Tamil Nadu'),
(1130, 'Malar G', 'F', '2007-02-05', 'malar.g@gmail.com', '7800000130', 7.8, 68, 305, 'IT', 2029, 215000, 'AB-', 'PERI', 600119, 'Indian', 'Tamil Nadu'),

-- Block 14: Final mixed batch 2 (Indian - Tamil Nadu mostly)
(1131, 'Ajay T', 'M', '2003-07-18', 'ajay.t@gmail.com', '7700000131', 8.5, 88, 302, 'CSE', 2025, 200000, 'O+', 'GNC', 600119, 'Indian', 'Tamil Nadu'),
(1132, 'Pavithra B', 'F', '2004-12-22', 'pavithra.b@yahoo.com', '7700000132', 9.1, 85, 303, 'ECE', 2026, 185000, 'B+', 'PSVPCE', 600025, 'Indian', 'Tamil Nadu'),
(1133, 'Surya P', 'M', '2002-05-05', 'surya.p@gmail.com', '7700000133', 7.5, 55, 301, 'MECH', 2024, 150000, 'A+', 'PDKV', 600044, 'Indian', 'Tamil Nadu'),
(1134, 'Indhu M', 'F', '2005-10-14+', 'indhu.m@gmail.com', '7700000134', 8.8, 75, 305, 'IT', 2027, 220000, 'O-', 'CIT', 603203, 'Indian', 'Tamil Nadu'),
(1135, 'Loganathan R', 'M', '2006-03-30', 'loganathan.r@outlook.com', '7700000135', 7.2, 68, 304, 'CIVIL', 2028, 140000, 'AB+', 'VIT', 632014, 'Indian', 'Tamil Nadu'),
(1136, 'Keerthana S', 'F', '2003-08-12', 'keerthana.s@gmail.com', '7600000136', 8.1, 78, 302, 'CSE', 2025, 205000, 'A-', 'SSN', 600097, 'Indian', 'Tamil Nadu'),
(1137, 'Vijay K', 'M', '2004-01-25', 'vijay.k@gmail.com', '7600000137', 9.5, 90, 303, 'ECE', 2026, 180000, 'O+', 'SRM', 600126, 'Indian', 'Tamil Nadu'),
(1138, 'Ramya C', 'F', '2002-06-10', 'ramya.c@yahoo.com', '7600000138', 6.5, 45, 301, 'MECH', 2024, 155000, 'B-', 'MIT', 600069, 'Indian', 'Tamil Nadu'),
(1139, 'Hari V', 'M', '2005-11-21', 'hari.v@gmail.com', '7600000139', 8.5, 88, 305, 'IT', 2027, 210000, 'O+', 'CEG', 600042, 'Indian', 'Tamil Nadu'),
(1140, 'Geetha D', 'F', '2007-04-05', 'geetha.d@gmail.com', '7600000140', 7.8, 68, 304, 'CIVIL', 2029, 145000, 'AB-', 'KCG', 600119, 'Indian', 'Tamil Nadu'),

-- Block 15: Final mixed batch 3 (Indian - Tamil Nadu mostly)
(1141, 'Pranav S', 'M', '2003-09-18', 'pranav.s@gmail.com', '7500000141', 8.5, 88, 302, 'CSE', 2025, 200000, 'O+', 'PERI', 600119, 'Indian', 'Tamil Nadu'),
(1142, 'Divya P', 'F', '2004-02-22', 'divya.p@yahoo.com', '7500000142', 9.1, 85, 303, 'ECE', 2026, 185000, 'B+', 'GNC', 600025, 'Indian', 'Tamil Nadu'),
(1143, 'Murali K', 'M', '2002-07-05', 'murali.k@gmail.com', '7500000143', 7.5, 55, 301, 'MECH', 2024, 150000, 'A+', 'PSVPCE', 600044, 'Indian', 'Tamil Nadu'),
(1144, 'Lavanya M', 'F', '2005-12-14', 'lavanya.m@gmail.com', '7500000144', 8.8, 75, 305, 'IT', 2027, 220000, 'O-', 'PDKV', 603203, 'Indian', 'Tamil Nadu'),
(1145, 'Sudhakar R', 'M', '2006-05-30', 'sudhakar.r@outlook.com', '7500000145', 7.2, 68, 304, 'CIVIL', 2028, 140000, 'AB+', 'CIT', 632014, 'Indian', 'Tamil Nadu'),
(1146, 'Yamini S', 'F', '2003-10-12', 'yamini.s@gmail.com', '7400000146', 8.1, 78, 302, 'CSE', 2025, 205000, 'A-', 'VIT', 600097, 'Indian', 'Tamil Nadu'),
(1147, 'Jeeva K', 'M', '2004-03-25', 'jeeva.k@gmail.com', '7400000147', 9.5, 90, 303, 'ECE', 2026, 180000, 'O+', 'SSN', 600126, 'Indian', 'Tamil Nadu'),
(1148, 'Sowmya C', 'F', '2002-08-10', 'sowmya.c@yahoo.com', '7400000148', 6.5, 45, 301, 'MECH', 2024, 155000, 'B-', 'SRM', 600069, 'Indian', 'Tamil Nadu'),
(1149, 'Kavin V', 'M', '2005-01-21', 'kavin.v@gmail.com', '7400000149', 8.5, 88, 305, 'IT', 2027, 210000, 'O+', 'MIT', 600042, 'Indian', 'Tamil Nadu'),
(1150, 'Roopa D', 'F', '2007-06-05', 'roopa.d@gmail.com', '7400000150', 7.8, 68, 304, 'CIVIL', 2029, 145000, 'AB-', 'CEG', 600119, 'Indian', 'Tamil Nadu');







// 2) get all female student's ht_number,name whose cgpa more than 9.0 ✅

// 3) get all studnets who is from tamilnadu from psvpce college ✅

// 4) get (ht_number,name,college_name,dob) of every indian who born in 2005 ✅

// 5) get all students who using @yahoo.com in their mail ✅

// 6) get ht_number,name,college_name,yop of all students who joined in 2024 ✅

// 6.1) get all student's whole 4 years acedamic  ✅
    //  fee with theri ht_number, college_name, total_fee 

// 7) get all students coming from abrod ✅

// 8) get all Australian country Pincodes 

// 9) get all state names in india

// =============== AGGREGATION FUNCTION =========

// 1) get ht_number, name of student who having max cgpa in PSVPCE college

// 2) get lowers fee paying student from MIT 

// 3) counts students who have cgpa greator than 8.5 from abrod ✅

// 4) get department wise student count in PSVPCE ✅

// 5) get nationality wise maximum CGPA of students with college name ✅ 

// 6) get all student count form all colleges with attendence less than 65

// 6.1) get minimum attendence in every college ✅

// 7) get count of blood groups from india 




// -=============================================================================================


// ============================== NEW TABLE NEW DATA =================================================

create table employee(
	emp_id int primary key,
    emp_name varchar(20),
    gender char(1),
    email varchar(20) UNI,
    phone_number varchar(10),
    experience float,
    salary double,
    increment double,
    role varchar(20),
    rating int
    dept_id int,
    dept_name varchar(20),
    shift_time varchar(20),
    project_name varchar(20),
    project_deadline date,
    levae_count int,
    is_permenant boolean,
    company_name varchar(20),
    nationality varchar(20),
    state varchar(20),
);

