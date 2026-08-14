students = []
import random
rows = 5
cols = 6
mi = 0
mx = rows*cols
for i in range(mx):
    idx = random.randrange(mi,mx)
    person = random.choice([1,2])
    row = idx % cols
    col =int(idx / cols)
    if ([row,col],person) not in students:
        students.append(([row,col],person))

for i in  students:
    print(i)
    for i in range(20):
        print()
import random
students = []
rows = 5
cols = 6
for row in range(rows):
    for col in range(cols):
        students.append(((row, col), 1))
        students.append(((row, col), 2))
random.shuffle(students)
for student in students:
    print(student)


    
batch4 = [
    "Hari Hara VarshiniS",
    "PREETHIKAB B",
    "Tamil selviD",
    "RaguramR",
    "EASWARS",
    "S RachelJenelia",
    "DeepaP",
    "RINDHYA RANIS",
    "MathanrajR",
    "DeviV",
    "FrangilinA",
    "ShaikHisham s.k",
    "yogeshwari.k",
    "SangeethaSri",
    "ThanigavelD",
    "SwethaJ",
    "Priya dharshini.BB",
    "MohanKumar",
    "MelwinV",
    "NavinM",
    "SriramM",
    "SudharshiiniD",
    "SwadhiM",
    "SabarishM R",
    "BhuvaneshC",
    "HarinishanM",
    "MalathyG",
    "DilliBabu",
    "JeevaS",
    "YokeshwaranS",
    "siddeshwarR",
    "BhuvanaH",
    "VanishaAshok",
    "LokeshwaranM",
    "HashmithaP",
    "SivaneshP",
    "AkashS",
    "ApsarkhanS",
    "SanthoshC",
    "NaghulPranav bk",
    "PADMAPRIYAS",
    "VEERANM",
    "SANTHOSHKRISHNAN R",
    "N MOHAMEDNAWAZ",
    "RahulM.Rahul",
    "SharveshR",
    "R.Hariharan",
    "SINDHUJAV",
    "sathyasriG",
    "Safrin BegamA",
    "ARUNT",
    "Harini SreeR",
    "ILAMPARITHIM.E.S",
    "RanjaniS",
    "VaishaliE",
    "DAVANITHIK",
    "Aswinv",
    "HIGREESHS",
    "JaiAlaskA",
    "DHANYASREE.T.K",
    "Sutharsanabalan.D",
    "HemamaliniR"
]

import random

batch5 = [  
    "KomathyD",
    "YasikaS",
    "BAVINBALAB",
    "NaveenkumarV",
    "ChandrasekaranM",
    "LAVANYAV",
    "Harini.A-",
    "VelammalM",
    "OmprakashGanesan",
    "GopikaR",
    "JENIFFERM",
    "ShahinS",
    "Dharun AadhithyaT",
    "SandhiyaS",
    "Saru DharshiniR",
    "AnsleySingh",
    "SaravananS",
    "REVATHIR",
    "MONISHV",
    "KiruthikaH",
    "PreethiJ",
    "Priya DarshiniR",
    "S.TAMILARASAN",
    "SUJITHA",
    "Ranjani ShreeM",
    "Benny peterJohnson",
    "Nithya sriT",
    "MathimalarB",
    "KanishkaM",
    "LogithS",
    "Nithish RajA",
    "BHUVANESWARIS",
    "MohammedWaqif M",
    "K.jeevitha",
    "ManishaS",
    "TharunS",
    "ThiruVarangan",
    "YuvashreeA",
    "KanishK",
    "RishimaIR",
    "SadhanaC",
    "RAJAR",
    "Sachin.P",
    "Nithish kumarS",
    "Ilakiya PriyaN",
    "MayuthraP",
    "GOKULS",
    "Nithya SriAruna. M",
    "JoginderGeethai nayagan",
    "SHWETASRI",
    "priyadharshini",
    "KeerthanaMurugan",
    "Nitesh KumarM",
    "HariSaran.S",
    "sudharsank",
    "Muthu Prajan.M",
    "DeepakM",
    "A.Infantious GabrielGabriel",
    "VengateshL",
    "DevikaV",
    "MENAGAM",
    "AmeerBasha"
]
print(random.choice(batch4))

names = [
    "JeevidhyaN",
    "GatherinBlessmi B",
    "BalaVignesh",
    "MohanBabu S",
    "PoojaB",
    "JoyElizabeth",
    "Dharani dharanS",
    "AnburajA",
    "M.MohammedShameer",
    "HemapriyaS",
    "VishnupriyaR",
    "subhikshas",
    "SubashreeB",
    "SabariR",
    "Gouthamans",
    "JaganG",
    "DHARSHINIB",
    "J.tharikaSri",
    "SharuthiA. S",
    "M.HariKrishna",
    "SUDHARSANG",
    "vaishnaviH",
    "MuthuPandi",
    "VarshiniVaratharajan",
    "HEMNATHB",
    "YuvashreeJ",
    "RajmohanM",
    "SuryaK",
    "HarishShriram ts",
    "BhuvaneshwariR",
    "AbiramiG",
    "PrincyAnishta",
    "SARANS",
    "PriyaM",
    "MukilanM",
    "SANTHOSH.T",
    "MONIKAV",
    "D.PRASANAKUMAR",
    "MGowsalya",
    "HariniC",
    "SHRI VISHNU ARAVINDR",
    "MohanaPriya G",
    "KaviyaS",
    "PrithikaT.K",
    "DhanushaG",
    "VISHWAN",
    "SASIKUMARP",
    "Sudhesi mithiranD",
    "VaishnaviR",
    "JAGADEESHWARIG",
    "VijiSharon A",
    "KeerthanaMuthukumar",
    "GokulRaj",
    "MONIKAK",
    "SwethaS",
    "NikithaK",
    "ADITHYAC", 
    "SivanesanS",
    "SrenethS",
    "Niranjan kumarM",
    "YazhiniS",
    "MonicaK",
    "HEMALATHAB E"
]

s = "10001001,01010000,01001110,01000111,00001101,00001010,00011010,00001010,00000000,00000000,00000000,00001101,01001001,01001000,01000100,01010010,00000000,00000000,00000000,00000001,00000000,00000000,00000000,00000001,00000001,00000011,00000000,00000000,00000000,00100101,11011011,01010110,11001010,00000000,00000000,00000000,00000011,01010000,01001100,01010100,01000101,00000000,00000000,00000000,10100111,01111010,00111101,11011010,00000000,00000000,00000000,00000001,01110100,01010010,01001110,01010011,00000000,01000000,11100110,11011000,01100110,00000000,00000000,00000000,00001010,01001001,01000100,01000001,01010100,00001000,11010111,01100011,01100000,00000000,00000000,00000000,00000010,00000000,00000001,11100010,00100001,10111100,00110011,00000000,00000000,00000000,00000000,01001001,01000101,01001110,01000100,10101110,01000010,01100000,10000010"
print(len(s.split(","))*8   )