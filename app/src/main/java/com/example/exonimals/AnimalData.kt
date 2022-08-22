package com.example.exonimals

object AnimalData {
    private val names = arrayOf(
        "Kukang",
        "Bebek Mandarin",
        "Tapir",
        "Naga Laut Berdaun",
        "Anglerfish",
        "Kera Jepang",
        "Lumba-lumba Amazon",
        "Katak Atelopus",
        "Trenggiling",
        "Rubah Fennec",
        "Walabi",
        "Sugar Glider",
        "Margay",
        "Kelinci Patagonia",
        "Makau Merah",
    )

    private val classifications = arrayOf(
        "Mammalia",
        "Aves",
        "Mammalia",
        "Actinopterygii",
        "Actinopterygii",
        "Mammalia",
        "Mammalia",
        "Reptilia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Mammalia",
        "Aves",
    )

    private val latinNames = arrayOf(
        "Nycticebus coucang",
        "Aix galericulata",
        "Tapirus bairdii",
        "Phycodurus eques",
        "Lophius piscatorius",
        "Macaca fuscata",
        "Inia geoffrensis",
        "Atelopus varius",
        "Manis pentadactyla",
        "Vulpes zerda",
        "Macropus parma",
        "Petaurus breviceps",
        "Leopardus wiedii",
        "Dolichotis patagonum",
        "Ara macao",
    )

    private val habitats = arrayOf(
        "Asia Tenggara",
        "Asia Timur, Eropa Barat",
        "Amerika Tengah, Asia Tenggara",
        "Australia",
        "Pasifik, Atlantik",
        "Asia Timur",
        "Amerika Selatan",
        "Amerika Utara",
        "Asia",
        "Afrika Utara",
        "Australia, Oceania",
        "Australia, Oceania",
        "Amerika Selatan",
        "Amerika Selatan",
        "Amerika Selatan",
    )

    private val diets = arrayOf(
        "Omnivora",
        "Omnivora",
        "Herbivora",
        "Karnivora",
        "Karnivora",
        "Omnivora",
        "Karnivora",
        "Insectivora",
        "Insectivora",
        "Omnivora",
        "Herbivora",
        "Omnivora",
        "Karivora",
        "Herbivora",
        "Omnivora",
    )

    private val descriptions = arrayOf(
        "Kukang adalah primata nokturnal yang beristirahat di siang hari di cabang-cabang pohon, atau di vegetasi lebat dan makan di malam hari. Tidak seperti spesies kukang lainnya, mereka tinggal di pohon hampir sepanjang hidup mereka dan tidur di sebuah bola di cabang atau dedaunan. Mereka biasanya tidur sendiri tetapi dapat tidur dengan beberapa orang sejenis (individu dari spesies yang sama), termasuk orang dewasa lainnya. Saat terancam predator, kukang Sunda dapat menggigit, berguling menjadi bola yang memperlihatkan bulu beracunnya yang tertutup air liur, atau berguling dan jatuh dari pohon. Namun, metode utama penghindaran predator adalah cryptsis (kamuflase), dimana ia bersembunyi.",
        "Bebek Mandarin, yang disebut yuan-yang oleh orang Cina, sering ditampilkan dalam seni Oriental dan dianggap sebagai simbol kesetiaan dan kasih sayang suami istri. Laki-laki dewasa mencolok dan jelas, dengan paruh merah, bulan sabit putih besar di atas matanya, dan wajah kemerahan dengan \"kumis\". Dadanya berwarna ungu dengan garis putih vertikal ganda dan panggulnya berwarna merah dan memiliki dua \"layar\" oranye di bagian belakang. Selama molting, jantan menyerupai betina tetapi paruh merah mereka adalah titik perbedaan mereka. Paruh betina berwarna merah muda dan dia jauh lebih tidak berwarna daripada pasangannya. Dia adalah krem pucat dengan garis sayap putih tipis dan bagian bawah tubuh putih dan memiliki cincin mata putih dari mana garis berjalan ke bagian belakang kepalanya.",
        "Tapir adalah spesies primitif, terlihat seperti nenek moyang badak dan kuda. Hidung yang panjang, berdaging, dan seperti belalai adalah salah satu ciri khas hewan ini. Kaki belakang tapir ini memiliki 3 jari kaki yang melebar, sedangkan kaki depan menampilkan 4 jari kaki. Ini adalah mamalia terbesar, asli Amerika Tengah, di mana ia mendiami hutan tropis dan padang rumput. Tapir hampir tidak berubah selama 35 juta tahun terakhir. Mamalia ini sangat pemalu dan pendiam sehingga sulit ditemukan di alam liar.",
        "Naga laut berdaun ditemukan di sepanjang pantai selatan dan barat Australia. Nama ini berasal dari penampilannya, dengan tonjolan panjang seperti daun yang berasal dari seluruh tubuh. Tonjolan ini tidak digunakan untuk penggerak; mereka hanya berfungsi sebagai kamuflase. Naga laut yang berdaun mendorong dirinya melalui sirip dada di punggung lehernya dan sirip punggung di punggungnya lebih dekat ke ujung ekor. Sirip kecil ini hampir sepenuhnya transparan dan sulit dilihat karena mereka berombak untuk menggerakkan makhluk itu dengan tenang di dalam air, melengkapi ilusi rumput laut yang mengambang.",
        "Anglerfish adalah ikan dari ordo teleost Lophiiformes. Mereka adalah ikan bertulang yang dinamai sesuai dengan karakteristik mode predasi mereka, di mana sinar sirip luminescent yang dimodifikasi (esca atau illicium) bertindak sebagai umpan untuk ikan lain. Pendaran tersebut berasal dari bakteri simbiosis, yang diduga diperoleh dari air laut, yang berdiam di dalam dan sekitar laut. Beberapa anglerfish terkenal karena dimorfisme seksual yang ekstrim dan simbiosis seksual jantan kecil dengan betina yang jauh lebih besar, terlihat di subordo Ceratiidae, anglerfish laut dalam. Dalam spesies ini, jantan mungkin beberapa kali lipat lebih kecil dari betina.",
        "Kera Jepang adalah spesies monyet Dunia Lama - primata bukan manusia yang hidup paling utara. Mereka secara sehari-hari disebut sebagai \"monyet salju\" karena beberapa tinggal di daerah di mana salju menutupi tanah selama berbulan-bulan setiap tahun. Mereka memiliki bulu yang panjang dan tebal, berwarna coklat atau abu-abu. Bulu lebat kontras dengan wajah mereka, yang memiliki kulit telanjang, seperti halnya pantat mereka, yang merah pada orang dewasa. Jantan lebih besar dari betina. Kera memiliki kumis panjang dan janggut, dan ekornya pendek. Seperti spesies monyet lainnya, kera memiliki ibu jari yang berlawanan, memungkinkannya untuk memegang sesuatu. Ia berjalan dengan kaki belakangnya ketika memegang sesuatu di tangannya.",
        "Lumba-lumba Amazon, atau disebut juga Lumba-lumba Boto adalah salah satu dari lima lumba-lumba sungai dan merupakan spesies paling terkenal dari kelompoknya. Tubuh mamalia ini panjang dan montok, sedangkan siripnya mengingatkan pada dayung dari bentuknya. Selain itu, hewan ini dapat dengan mudah diidentifikasi dengan memiliki punggung di punggungnya, bukan sirip punggung. Lumba-lumba Sungai Amazon juga menonjol dari spesies lumba-lumba lainnya karena warnanya, mulai dari abu-abu kebiruan hingga putih, dan terkadang merah muda. Beberapa tulang belakang lumba-lumba tidak menyatu, membuat leher hewan itu sangat fleksibel, yang memungkinkan lumba-lumba menggerakkan kepalanya ke hampir semua arah.",
        "Atelopus varius, katak harlequin variabel Kosta Rika atau katak badut, adalah katak kecil Neotropis sejati dari keluarga Bufonidae. Setelah mulai dari Kosta Rika hingga Panama, A. varius sekarang terdaftar sebagai sangat terancam punah dan telah berkurang menjadi satu populasi yang tersisa di dekat Quepos, Kosta Rika dan hanya memiliki populasi peninggalan di Panama barat . Variasi terbaru dalam suhu udara, curah hujan, pola aliran sungai, dan penyebaran berikutnya dari jamur chytrid patogen terkait dengan perubahan iklim global telah menjadi penyebab utama penurunan A. varius .",
        "Mamalia yang paling banyak diburu manusia bukanlah harimau, badak atau gajah melainkan trenggiling. Trenggiling adalah salah satu dari hanya delapan spesies dalam ordo Pholodia, yang berarti 'binatang bersisik'. Hewan ini juga dikenal dengan nama trenggiling bersisik dan ia mengkhususkan diri dalam memakan semut dan rayap saja. ",
        "Rubah Fennec ditemukan di seluruh Sahara, dari Maroko dan Mauritania ke Sudan utara, melalui Mesir, Semenanjung Sinai, dan gurun Arava dan Negev di Israel selatan. Ini mendiami bukit pasir kecil dan daerah pasir luas tanpa pohon dekat biaya dengan vegetasi jarang seperti rumput, sedges, dan semak-semak kecil.",
        "Hewan ini berasal dari keluarga yang sama dengan kanguru tetapi berbeda secara spesifik dalam ukuran — mereka lebih kecil dari kanguru. Ada 11 spesies walabi yang berbeda. Seorang bayi dikenal sebagai \"joey\", sedangkan orang dewasa dikenal sebagai \"boomer\" atau \"buck\" (jika laki-laki) dan \"doe\" atau \"jill\" (jika perempuan). Wallabi memakan rumput, dedaunan, dan sayuran terutama, dan berkumpul di sekitar lubang air selama musim kemarau.",
        "Namanya tidak jauh perilaku hewan ini - makanan manis adalah makanan pilihan mereka, dan mereka memiliki kemampuan untuk meluncur di udara, seperti tupai terbang. Bagi mereka, meluncur bukan hanya sebagai alat bergerak, tetapi juga cara mencari makanan dan menghindari pemangsa. Mereka terutama ditemukan di beberapa bagian Australia, New Guinea, dan Tasmania.",
        "Kucing Margay hidup di seluruh Amerika Selatan dan Meksiko dan berkerabat dengan Ocelot, yang menawarkan kemiripan yang mencolok; mereka kadang-kadang dikenal sebagai \"ocelot pohon\" karena kemampuan memanjat mereka yang luar biasa. Kucing ini menghabiskan sebagian besar waktunya di pohon, bukan di tanah, dan bisa melompat hingga 12 kaki ke udara. Mereka juga terutama hewan nokturnal.",
        "Kelinci Patagonia secara teknis merupakan bagian dari keluarga hewan pengerat. Mereka dapat ditemukan di Argentina dan hidup dalam mode monogami yang sangat khusus, meskipun mereka kadang-kadang berkembang biak dalam kelompok hingga 29 pasang. Mitra adalah monogami satu sama lain kecuali satu mati, setelah itu yang tersisa dapat menemukan pasangan lain. Mereka membedakan satu sama lain berdasarkan wilayah yang ditandai baik oleh diri mereka sendiri atau oleh pasangan mereka.",
        "Makau Merah secara luas dianggap oleh pecinta burung sebagai burung beo yang paling indah, macaw merah termasuk yang paling berwarna-warni. Mereka memiliki warna bulu merah, biru, dan kuning. Burung yang mencolok dan berani ini penuh energi dan memiliki kepribadian yang positif."
    )

    private val photos = arrayOf(
        R.drawable.kukang_asia,
        R.drawable.bebek_mandarin,
        R.drawable.tapir,
        R.drawable.naga_laut_berdaun,
        R.drawable.anglerfish,
        R.drawable.kera_jepang,
        R.drawable.lumba_lumba_amazon,
        R.drawable.katak_atelopus,
        R.drawable.trenggiling,
        R.drawable.rubah_fennec,
        R.drawable.walabi,
        R.drawable.sugar_glider,
        R.drawable.kucing_margay,
        R.drawable.kelinci_patagonia,
        R.drawable.makau_merah,
    )

    val listAnimals: ArrayList<Animal>
        get(){
            val list = ArrayList<Animal>()
            for (pos in names.indices){
                val animal = Animal()
                animal.name = names[pos]
                animal.classification = classifications[pos]
                animal.latinName = latinNames[pos]
                animal.habitat = habitats[pos]
                animal.diet = diets[pos]
                animal.description = descriptions[pos]
                animal.photo = photos[pos]

                list.add(animal)
            }
            return list
        }
}