package MMA.triviaquiz;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


class TriviaQuizHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DB_NAME = "TQuiz2.db";


    private static final int DB_VERSION = 2;

    private static final String TABLE_NAME = "TQ";

    private static final String UID = "_UID";

    private static final String QUESTION = "QUESTION";

    private static final String OPTA = "OPTA";

    private static final String OPTB = "OPTB";

    private static final String OPTC = "OPTC";

    private static final String OPTD = "OPTD";

    private static final String ANSWER = "ANSWER";

    private static final String CAT = "CAT";

    private static final String INFO = "INFO";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255)," + CAT + " VARCHAR(255)," + INFO + " VARCHAR(500));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    TriviaQuizHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }

    void eduQuestion() {

        ArrayList<TriviaQuestion> arraylist = new ArrayList<>();

        arraylist.add(new TriviaQuestion("What did Lipperhey invent?", "Telescope", "Airoplane", "Electricity", "Train", "Telescope","Educational","Lippershey laid claim to a device that could magnify objects three times. His telescope had a concave eyepiece aligned with a convex objective lens."));

        arraylist.add(new TriviaQuestion("Who is the father of Geometry ?", "Aristotle", "Euclid", "Pythagoras", "Kepler", "Euclid","Educational","Euclid sometimes called Euclid of Alexandria to distinguish him from Euclid of Megara, was a Greek mathematician, often referred to as the founder of geometry or the father of geometry."));

        arraylist.add(new TriviaQuestion("Which of these plays important role in cell division in animal cell ?", "Centriole", "Mitochondria", "Golgi complex", "None of these", "Centriole","Educational","a centriole is a cylindrical organelle composed mainly of a protein called tubulin. Centrioles are found in most eukaryotic cells. A bound pair of centrioles, surrounded by a shapeless mass of dense material, called the pericentriolar material (PCM), makes up a structure called a centrosome."));

        arraylist.add(new TriviaQuestion("The first woman in space was ?", "Valentina Tereshkova", "Sally Ride", "Naidia Comenci", "Tamara Press", "Valentina Tereshkova","Educational","Valentina Tereshkova is a retired Soviet cosmonaut, engineer, and current member of the Russian State Duma. She is the first woman to have flown in space with a solo mission on the Vostok 6 on 16 June 1963. Tereshkova also became the first civilian to fly in space."));

        arraylist.add(new TriviaQuestion("Who invented the famous formula E=mc^2", "Albert Einstein", "Galilio", "Sarvesh", "Bill Gates", "Albert Einstein","Educational","In physics, mass–energy equivalence states that anything having mass has an equivalent amount of energy and vice versa, with these fundamental quantities directly relating to one another by Albert Einstein's famous formula E=mc^2"));


        this.addAllQuestions(arraylist);

    }

    void healthQuestion() {

        ArrayList<TriviaQuestion> arraylist = new ArrayList<>();

        arraylist.add(new TriviaQuestion("A substance needed by the body for growth, energy, repair and maintenance iscalled a _______________.", "nutrient", "carbohydrate", "calorie", "fatty acid", "nutrient","Health","A nutrient is a substance used by an organism to survive, grow, and reproduce. The requirement for dietary nutrient intake applies to animals, plants, fungi, and protists."));

        arraylist.add(new TriviaQuestion("A diet high in saturated fats can be linked to which of the following?", "kidney failure", "bulimia", "anorexia", "cardiovascular disease", "cardiovascular disease","Health","Cardiovascular disease (CVD) is a class of diseases that involve the heart or blood vessels. CVD includes coronary artery diseases (CAD) such as angina and myocardial infarction (commonly known as a heart attack)."));

        arraylist.add(new TriviaQuestion("Your body needs vitamins and minerals because ___________.", "they give the body energy", "they help carry out metabolic reactions", "they insulate the body’s organs", "they withdraw heat from the body", "they help carry out metabolic reactions","Health","Your body needs certain minerals to build strong bones and teeth and turn the food you eat into energy. As with vitamins, a healthy balanced diet should provide all the minerals your body needs to work properly. Essential minerals include calcium, iron and potassium"));

        arraylist.add(new TriviaQuestion("Food passes through the stomach directly by _________.", "the large intestine", "the small intestine", "the heart", "the pancreas", "the small intestine","Health","Esophagus: a muscular tube that allows food to pass from the pharynx to the stomach. Through peristalsis the esophagus is able to push food from the pharynx to the stomach, even if the individual is standing on their head."));

        arraylist.add(new TriviaQuestion("A mineral that the body needs to work properly is _____________.", "calcium", "silver", "gold", "lead", "calcium","Health","Minerals. Your body needs certain minerals to build strong bones and teeth and turn the food you eat into energy. As with vitamins, a healthy balanced diet should provide all the minerals your body needs to work properly. Essential minerals include calcium, iron and potassium."));



        this.addAllQuestions(arraylist);

    }

    void nrgQuestion() {


        ArrayList<TriviaQuestion> arraylist = new ArrayList<>();

        arraylist.add(new TriviaQuestion("Which of the following is a disadvantage of renewable energy?", "High pollution", "Available only in few places", "High running cost", "Unreliable supply", "Unreliable supply","Renewable Resources","Renewable energy often relies on the weather for its sources of power. Hydro generators need rain to fill dams and thereby provide electricity. Wind turbines need wind to turn the blades. Solar collectors need clear skies and sunshine."));

        arraylist.add(new TriviaQuestion("A Solar cell is an electrical device that converts the energy of light directly into electricity by the ____________", "Photovoltaic effect", "Chemical effect", "Atmospheric effect", "Physical effect", "Photovoltaic effect","Renewable Resources","The photovoltaic effect was first discovered in 1839 by Edmond Becquerel. The hotovoltaic effect is a process that generates voltage or electric current in a photovoltaic cell when it is exposed to sunlight."));

        arraylist.add(new TriviaQuestion("In hydroelectric power, what is necessary for the production of power throughout the year?", "Dams filled with water", "High amount of air", "High intense sunlight", "Nuclear power", "Dams filled with water","Renewable Resources","Dams are used for power generation. The reservoir water is stored at a higher level than the turbines, which are housed in a power station. The dam feed water directly to the turbines in the power station."));

        arraylist.add(new TriviaQuestion("The main composition of biogas is _______________", "Carbon dioxide", "Methane", "Nitrogen", "Hydrogen", "Methane","Renewable Resources","Biogas is one of the types of bio fuel that is produced from the decomposition of organic waste. Biogas is known as the environmentally-friendly energy source since it is converting organic waste into energy. The composition of biogas is as follows: – Methane 50-75%, Carbon dioxide 25-50%, Nitrogen 0-10%, Hydrogen 0-1%."));

        arraylist.add(new TriviaQuestion("Which of the following is not under the Ministry of New and Renewable Energy?", "Wind energy", "Solar energy", "Tidal energy", "Large hydro", "Large hydro","Renewable Resources","According to a recent survey large hydro installed capacity was 44.41 GW. The large hydro is administered separately by the Ministry of Power and not included in Ministry of New and Renewable Energy."));



        this.addAllQuestions(arraylist);

    }

    void allQuestion(){
        eduQuestion();
        healthQuestion();
        nrgQuestion();
    }

    private void addAllQuestions(ArrayList<TriviaQuestion> allQuestions) {

        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            for (TriviaQuestion question : allQuestions) {
                values.put(QUESTION, question.getQuestion());
                values.put(OPTA, question.getOptA());
                values.put(OPTB, question.getOptB());
                values.put(OPTC, question.getOptC());
                values.put(OPTD, question.getOptD());
                values.put(ANSWER, question.getAnswer());
                values.put(CAT, question.getCat());
                values.put(INFO, question.getinfo());
                db.insert(TABLE_NAME, null, values);
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }
    }

    List<TriviaQuestion> getNRGQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER,CAT,INFO};
        String selection = CAT +" =?";
        String[] selectionArgs = {"Renewable Resources"};
        Cursor cursor = db.query(TABLE_NAME, coloumn, selection, selectionArgs, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            question.setCat(cursor.getString(7));
            question.setinfo(cursor.getString(8));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }

    List<TriviaQuestion> getHealthQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER,CAT,INFO};
        String selection = CAT +" =?";
        String[] selectionArgs = {"Health"};
        Cursor cursor = db.query(TABLE_NAME, coloumn, selection, selectionArgs, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            question.setCat(cursor.getString(7));
            question.setinfo(cursor.getString(8));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }

    List<TriviaQuestion> getEduQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER,CAT,INFO};
        String selection = CAT +" =?";
        String[] selectionArgs = {"Educational"};
        Cursor cursor = db.query(TABLE_NAME, coloumn, selection, selectionArgs, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            question.setCat(cursor.getString(7));
            question.setinfo(cursor.getString(8));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }

    List<TriviaQuestion> getAllOfTheQuestions() {

        List<TriviaQuestion> questionsList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER,CAT,INFO};
        Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


        while (cursor.moveToNext()) {
            TriviaQuestion question = new TriviaQuestion();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOptA(cursor.getString(2));
            question.setOptB(cursor.getString(3));
            question.setOptC(cursor.getString(4));
            question.setOptD(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            question.setCat(cursor.getString(7));
            question.setinfo(cursor.getString(8));
            questionsList.add(question);
        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return questionsList;
    }
}
