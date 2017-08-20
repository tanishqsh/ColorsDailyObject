package xyz.tanishq.colorsdailyobject;

import android.annotation.TargetApi;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout book, cap, chair, pen, pencil, table;
    LinearLayout black, red, orange, yellow, green, blue;
    LinearLayout output;
    boolean isShapeSelected = false;
    boolean isColorSelected = false;
    LinearLayout shapeSelected;
    LinearLayout colorSelected;

    MediaPlayer blueS;
    MediaPlayer redS;
    MediaPlayer orangeS;
    MediaPlayer yellowS;
    MediaPlayer blackS;
    MediaPlayer greenS;


    MediaPlayer chairS, tableS, capS, bookS, pencilS, penS;
    MediaPlayer blackChairS, blueChairS, redChairS, yellowChairS, greenChairS, orangeChairS;
    MediaPlayer blackTableS, blueTableS, redTableS, yellowTableS, greenTableS, orangeTableS;
    MediaPlayer blackCapS, blueCapS, redCapS, yellowCapS, greenCapS, orangeCapS;
    MediaPlayer blackBookS, blueBookS, redBookS, yellowBookS, greenBookS, orangeBookS;
    MediaPlayer blackPencilS, bluePencilS, redPencilS, yellowPencilS, greenPencilS, orangePencilS;
    MediaPlayer blackPenS, bluePenS, redPenS, yellowPenS, greenPenS, orangePenS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book = (LinearLayout) findViewById(R.id.book);
        cap = (LinearLayout) findViewById(R.id.cap);
        chair = (LinearLayout) findViewById(R.id.chair);
        pen = (LinearLayout) findViewById(R.id.pen);
        pencil = (LinearLayout) findViewById(R.id.pencil);
        table = (LinearLayout) findViewById(R.id.table);
        output = (LinearLayout) findViewById(R.id.output);
        black = (LinearLayout) findViewById(R.id.black);
        red = (LinearLayout) findViewById(R.id.red);
        orange = (LinearLayout) findViewById(R.id.orange);
        yellow = (LinearLayout) findViewById(R.id.yellow);
        green = (LinearLayout) findViewById(R.id.green);
        blue = (LinearLayout) findViewById(R.id.blue);

        int colorids[] = {R.id.black, R.id.blue, R.id.red, R.id.yellow, R.id.orange, R.id.green};
        int objectids[] = {R.id.table, R.id.book, R.id.cap, R.id.pen, R.id.pencil, R.id.chair};

        book.setOnClickListener(this);
        cap.setOnClickListener(this);
        chair.setOnClickListener(this);
        pen.setOnClickListener(this);
        pencil.setOnClickListener(this);
        table.setOnClickListener(this);
        black.setOnClickListener(this);
        orange.setOnClickListener(this);
        yellow.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
        red.setOnClickListener(this);

        //colors
        blueS = MediaPlayer.create(this, R.raw.blue);
        redS = MediaPlayer.create(this, R.raw.red);
        orangeS = MediaPlayer.create(this, R.raw.orange);
        yellowS = MediaPlayer.create(this, R.raw.yellow);
        blackS = MediaPlayer.create(this, R.raw.black);
        greenS = MediaPlayer.create(this, R.raw.green);

        //objects
        chairS = MediaPlayer.create(this, R.raw.chair);
        bookS = MediaPlayer.create(this, R.raw.book);
        capS = MediaPlayer.create(this, R.raw.cap);
        penS = MediaPlayer.create(this, R.raw.pen);
        pencilS = MediaPlayer.create(this, R.raw.pencil);
        tableS = MediaPlayer.create(this, R.raw.table);

        //combination of table
        blackTableS = MediaPlayer.create(this, R.raw.blacktable);
        redTableS = MediaPlayer.create(this, R.raw.redtable);
        orangeTableS = MediaPlayer.create(this, R.raw.orangetable);
        blueTableS = MediaPlayer.create(this, R.raw.bluetable);
        yellowTableS = MediaPlayer.create(this, R.raw.yellowtable);
        greenTableS = MediaPlayer.create(this, R.raw.greentable);

        //combination of chair
        blackChairS = MediaPlayer.create(this, R.raw.blackchair);
        redChairS = MediaPlayer.create(this, R.raw.redchair);
        orangeChairS = MediaPlayer.create(this, R.raw.orangechair);
        blueChairS = MediaPlayer.create(this, R.raw.bluechair);
        yellowChairS = MediaPlayer.create(this, R.raw.yellowchair);
        greenChairS = MediaPlayer.create(this, R.raw.greenchair);

        //combination of pen
        blackPenS = MediaPlayer.create(this, R.raw.blackpen);
        redPenS = MediaPlayer.create(this, R.raw.redpen);
        orangePenS = MediaPlayer.create(this, R.raw.orangepen);
        bluePenS = MediaPlayer.create(this, R.raw.bluepen);
        yellowPenS = MediaPlayer.create(this, R.raw.yellowpen);
        greenPenS = MediaPlayer.create(this, R.raw.greenpen);

        //combination of pencil
        blackPencilS = MediaPlayer.create(this, R.raw.blackpencil);
        redPencilS = MediaPlayer.create(this, R.raw.redpencil);
        orangePencilS = MediaPlayer.create(this, R.raw.orangepencil);
        bluePencilS = MediaPlayer.create(this, R.raw.bluepencil);
        yellowPencilS = MediaPlayer.create(this, R.raw.yellowpencil);
        greenPencilS = MediaPlayer.create(this, R.raw.greenpencil);

        //combination of book
        blackBookS = MediaPlayer.create(this, R.raw.blackbook);
        redBookS = MediaPlayer.create(this, R.raw.redbook);
        orangeBookS = MediaPlayer.create(this, R.raw.orangebook);
        blueBookS = MediaPlayer.create(this, R.raw.bluebook);
        yellowBookS = MediaPlayer.create(this, R.raw.yellowbook);
        greenBookS = MediaPlayer.create(this, R.raw.greenbook);

        //combination of cap
        blackCapS = MediaPlayer.create(this, R.raw.blackcap);
        redCapS = MediaPlayer.create(this, R.raw.redcap);
        orangeCapS = MediaPlayer.create(this, R.raw.orangecap);
        blueCapS = MediaPlayer.create(this, R.raw.bluecap);
        yellowCapS = MediaPlayer.create(this, R.raw.yellowcap);
        greenCapS = MediaPlayer.create(this, R.raw.greencap);

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(!isShapeSelected){

            switch (id) {
                case R.id.black:
                    output.setBackgroundColor(getResources().getColor(R.color.black));
                    isColorSelected=true;
                    blackS.start();
                    colorSelected = black;

                    break;
                case R.id.blue:
                    output.setBackgroundColor(getResources().getColor(R.color.blue));
                    isColorSelected=true;
                    blueS.start();
                    colorSelected = blue;

                    break;
                case R.id.green:
                    output.setBackgroundColor(getResources().getColor(R.color.green));
                    isColorSelected=true;
                    greenS.start();
                    colorSelected = green;

                    break;
                case R.id.yellow:
                    output.setBackgroundColor(getResources().getColor(R.color.yellow));
                    isColorSelected=true;
                    yellowS.start();
                    colorSelected = yellow;

                    break;
                case R.id.red:
                    output.setBackgroundColor(getResources().getColor(R.color.red));
                    isColorSelected=true;
                    redS.start();
                    colorSelected = red;

                    break;
                case R.id.orange:
                    output.setBackgroundColor(getResources().getColor(R.color.orange));
                    isColorSelected=true;
                    orangeS.start();
                    colorSelected = orange;

                    break;
                case R.id.book:
                    output.setBackground(getResources().getDrawable(R.drawable.book));
                    isShapeSelected=true;
                    bookS.start();
                    shapeSelected = book;

                    break;
                case R.id.cap:
                    output.setBackground(getResources().getDrawable(R.drawable.cap));
                    isShapeSelected=true;
                    capS.start();
                    shapeSelected = cap;

                    break;
                case R.id.chair:
                    output.setBackground(getResources().getDrawable(R.drawable.chair));
                    isShapeSelected=true;
                    chairS.start();
                    shapeSelected = chair;

                    break;
                case R.id.pen:
                    output.setBackground(getResources().getDrawable(R.drawable.pen));
                    isShapeSelected=true;
                    penS.start();
                    shapeSelected = pen;

                    break;
                case R.id.pencil:
                    output.setBackground(getResources().getDrawable(R.drawable.pencil));
                    isShapeSelected=true;
                    pencilS.start();
                    shapeSelected = pencil;

                    break;
                case R.id.table:
                    output.setBackground(getResources().getDrawable(R.drawable.table));
                    isShapeSelected=true;
                    tableS.start();
                    shapeSelected = table;

                    break;

            }

        } else {

            switch (shapeSelected.getId()){

                case R.id.table:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blacktable));
                            isColorSelected = true;
                            blackTableS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluetable));
                            colorSelected = blue;
                            blueTableS.start();
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greentable));
                            isColorSelected = true;
                            greenTableS.start();
                            colorSelected = green;
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowtable));
                            isColorSelected = true;
                            yellowTableS.start();
                            colorSelected = yellow;
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redtable));
                            isColorSelected = true;
                            redTableS.start();
                            colorSelected = red;
                            break;

                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangetable));
                            isColorSelected = true;
                            orangeTableS.start();
                            colorSelected = orange;
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;
                case R.id.book:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blackbook));
                            isColorSelected = true;
                            blackBookS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluebook));
                            blueBookS.start();
                            colorSelected = blue;
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greenbook));
                            isColorSelected = true;
                            greenBookS.start();
                            colorSelected = green;
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowbook));
                            isColorSelected = true;
                            yellowBookS.start();
                            colorSelected = yellow;
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redbook));
                            isColorSelected = true;
                            redBookS.start();
                            colorSelected = red;
                            break;
                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangebook));
                            isColorSelected = true;
                            orangeBookS.start();
                            colorSelected = orange;
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;

                case R.id.pencil:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blackpencil));
                            isColorSelected = true;
                            blackPencilS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluepencil));
                            colorSelected = blue;
                            bluePencilS.start();
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greenpencil));
                            isColorSelected = true;
                            colorSelected = green;
                            greenPencilS.start();
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowpencil));
                            isColorSelected = true;
                            colorSelected = yellow;
                            yellowPencilS.start();
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redpencil));
                            isColorSelected = true;
                            colorSelected = red;
                            redPencilS.start();
                            break;
                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangepencil));
                            isColorSelected = true;
                            colorSelected = orange;
                            orangePencilS.start();
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;
                case R.id.cap:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blackcap));
                            isColorSelected = true;
                            blackCapS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluecap));
                            colorSelected = blue;
                            blueCapS.start();
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greencap));
                            isColorSelected = true;
                            greenCapS.start();
                            colorSelected = green;
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowcap));
                            isColorSelected = true;
                            yellowCapS.start();
                            colorSelected = yellow;
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redcap));
                            isColorSelected = true;
                            redCapS.start();
                            colorSelected = red;
                            break;
                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangecap));
                            isColorSelected = true;
                            orangeCapS.start();
                            colorSelected = orange;
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;

                case R.id.pen:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blackpen));
                            isColorSelected = true;
                            blackPenS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluepen));
                            bluePenS.start();
                            colorSelected = blue;
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greenpen));
                            isColorSelected = true;
                            greenPenS.start();
                            colorSelected = green;
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowpen));
                            isColorSelected = true;
                            yellowPenS.start();;
                            colorSelected = yellow;
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redpen));
                            isColorSelected = true;
                            redPenS.start();
                            colorSelected = red;
                            break;
                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangepen));
                            isColorSelected = true;
                            orangePenS.start();
                            colorSelected = orange;
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;
                case R.id.chair:
                    switch (id) {
                        case R.id.black:
                            output.setBackground(getResources().getDrawable(R.drawable.blackchair));
                            isColorSelected = true;
                            blackChairS.start();
                            colorSelected = black;

                            break;
                        case R.id.blue:
                            output.setBackground(getResources().getDrawable(R.drawable.bluechair));
                            colorSelected = blue;
                            blueChairS.start();
                            break;
                        case R.id.green:
                            output.setBackground(getResources().getDrawable(R.drawable.greenchair));
                            isColorSelected = true;
                            greenChairS.start();
                            colorSelected = green;
                            break;
                        case R.id.yellow:
                            output.setBackground(getResources().getDrawable(R.drawable.yellowchair));
                            isColorSelected = true;
                            yellowChairS.start();
                            colorSelected = yellow;
                            break;
                        case R.id.red:
                            output.setBackground(getResources().getDrawable(R.drawable.redchair));
                            isColorSelected = true;
                            redChairS.start();
                            colorSelected = red;
                            break;
                        case R.id.orange:
                            output.setBackground(getResources().getDrawable(R.drawable.orangechair));
                            isColorSelected = true;
                            orangeChairS.start();
                            colorSelected = orange;
                            break;

                        case R.id.book:
                            output.setBackground(getResources().getDrawable(R.drawable.book));
                            bookS.start();
                            isShapeSelected=true;
                            shapeSelected = book;

                            break;
                        case R.id.cap:
                            output.setBackground(getResources().getDrawable(R.drawable.cap));
                            isShapeSelected=true;
                            capS.start();
                            shapeSelected = cap;

                            break;
                        case R.id.chair:
                            output.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            break;
                        case R.id.pen:
                            output.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            break;
                        case R.id.pencil:
                            output.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            break;
                        case R.id.table:
                            output.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            break;
                    }
                    break;

            }

        }



    }
}
