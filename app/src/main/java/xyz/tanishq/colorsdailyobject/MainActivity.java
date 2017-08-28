package xyz.tanishq.colorsdailyobject;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ball, bat, chair, pen, pencil, table;
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

    ImageView objectImages;
    TextView outputText;

    MediaPlayer chairS, tableS, batS, ballS, pencilS, penS;
    MediaPlayer blackChairS, blueChairS, redChairS, yellowChairS, greenChairS, orangeChairS;
    MediaPlayer blackTableS, blueTableS, redTableS, yellowTableS, greenTableS, orangeTableS;
    MediaPlayer blackbatS, bluebatS, redbatS, yellowbatS, greenbatS, orangebatS;
    MediaPlayer blackballS, blueballS, redballS, yellowballS, greenballS, orangeballS;
    MediaPlayer blackPencilS, bluePencilS, redPencilS, yellowPencilS, greenPencilS, orangePencilS;
    MediaPlayer blackPenS, bluePenS, redPenS, yellowPenS, greenPenS, orangePenS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = (LinearLayout) findViewById(R.id.ball);
        bat = (LinearLayout) findViewById(R.id.bat);
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
        int objectids[] = {R.id.table, R.id.ball, R.id.bat, R.id.pen, R.id.pencil, R.id.chair};

        objectImages = (ImageView) findViewById(R.id.objectImages);
        outputText = (TextView) findViewById(R.id.outputText);

        ball.setOnClickListener(this);
        bat.setOnClickListener(this);
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
        ballS = MediaPlayer.create(this, R.raw.ball);
        batS = MediaPlayer.create(this, R.raw.bat);
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

        //combination of ball
        blackballS = MediaPlayer.create(this, R.raw.blackball);
        redballS = MediaPlayer.create(this, R.raw.redball);
        orangeballS = MediaPlayer.create(this, R.raw.orangeball);
        blueballS = MediaPlayer.create(this, R.raw.blueball);
        yellowballS = MediaPlayer.create(this, R.raw.yellowball);
        greenballS = MediaPlayer.create(this, R.raw.greenball);

        //combination of bat
        blackbatS = MediaPlayer.create(this, R.raw.blackbat);
        redbatS = MediaPlayer.create(this, R.raw.redbat);
        orangebatS = MediaPlayer.create(this, R.raw.orangebat);
        bluebatS = MediaPlayer.create(this, R.raw.bluebat);
        yellowbatS = MediaPlayer.create(this, R.raw.yellowbat);
        greenbatS = MediaPlayer.create(this, R.raw.greenbat);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

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

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Black");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    colorSelected = black;

                    break;
                case R.id.blue:
                    output.setBackgroundColor(getResources().getColor(R.color.blue));
                    isColorSelected=true;
                    blueS.start();
                    colorSelected = blue;

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Blue");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    break;
                case R.id.green:
                    output.setBackgroundColor(getResources().getColor(R.color.green));
                    isColorSelected=true;
                    greenS.start();
                    colorSelected = green;

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Green");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    break;
                case R.id.yellow:
                    output.setBackgroundColor(getResources().getColor(R.color.yellow));
                    isColorSelected=true;
                    yellowS.start();
                    colorSelected = yellow;

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Yellow");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    break;
                case R.id.red:
                    output.setBackgroundColor(getResources().getColor(R.color.red));
                    isColorSelected=true;
                    redS.start();
                    colorSelected = red;

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Red");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    break;
                case R.id.orange:
                    output.setBackgroundColor(getResources().getColor(R.color.orange));
                    isColorSelected=true;
                    orangeS.start();
                    colorSelected = orange;

                    //info
                    objectImages.setVisibility(View.GONE);
                    outputText.setText("Orange");
                    outputText.setTextSize(50);
                    outputText.setTextColor(Color.parseColor("#FFFFFF"));

                    break;
                case R.id.ball:
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    isShapeSelected=true;
                    ballS.start();
                    shapeSelected = ball;

                    //object info

                    objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Ball");
                    outputText.setTextSize(30);

                    break;
                case R.id.bat:
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                    isShapeSelected=true;
                    batS.start();
                    shapeSelected = bat;

                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Bat");
                    outputText.setTextSize(30);

                    break;
                case R.id.chair:
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                    isShapeSelected=true;
                    chairS.start();
                    shapeSelected = chair;
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Chair");
                    outputText.setTextSize(30);

                    break;
                case R.id.pen:
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                    isShapeSelected=true;
                    penS.start();
                    shapeSelected = pen;

                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Pen");
                    outputText.setTextSize(30);

                    break;
                case R.id.pencil:
                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                    isShapeSelected=true;
                    pencilS.start();
                    shapeSelected = pencil;

                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Pencil");
                    outputText.setTextSize(30);

                    break;
                case R.id.table:
                    objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                    isShapeSelected=true;
                    tableS.start();
                    shapeSelected = table;

                    output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    objectImages.setVisibility(View.VISIBLE);
                    outputText.setTextColor(Color.parseColor("#000000"));
                    outputText.setText("Table");
                    outputText.setTextSize(30);

                    break;

            }

        } else {

            switch (shapeSelected.getId()){

                case R.id.table:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blacktable));
                            isColorSelected = true;
                            blackTableS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Table");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bluetable));
                            colorSelected = blue;
                            blueTableS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Table");
                            outputText.setTextSize(30);

                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greentable));
                            isColorSelected = true;
                            greenTableS.start();
                            colorSelected = green;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Table");
                            outputText.setTextSize(30);

                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowtable));
                            isColorSelected = true;
                            yellowTableS.start();
                            colorSelected = yellow;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Table");
                            outputText.setTextSize(30);

                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redtable));
                            isColorSelected = true;
                            redTableS.start();
                            colorSelected = red;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Table");
                            outputText.setTextSize(30);
                            break;

                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangetable));
                            isColorSelected = true;
                            orangeTableS.start();
                            colorSelected = orange;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Table");
                            outputText.setTextSize(30);
                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;
                case R.id.ball:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blackball));
                            isColorSelected = true;
                            blackballS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blueball));
                            blueballS.start();
                            colorSelected = blue;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greenball));
                            isColorSelected = true;
                            greenballS.start();
                            colorSelected = green;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowball));
                            isColorSelected = true;
                            yellowballS.start();
                            colorSelected = yellow;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Ball");
                            outputText.setTextSize(30);
                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redball));
                            isColorSelected = true;
                            redballS.start();
                            colorSelected = red;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangeball));
                            isColorSelected = true;
                            orangeballS.start();
                            colorSelected = orange;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Ball");
                            outputText.setTextSize(30);

                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;

                case R.id.pencil:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blackpencil));
                            isColorSelected = true;
                            blackPencilS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bluepencil));
                            colorSelected = blue;
                            bluePencilS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Pencil");
                            outputText.setTextSize(30);
                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greenpencil));
                            isColorSelected = true;
                            colorSelected = green;
                            greenPencilS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowpencil));
                            isColorSelected = true;
                            colorSelected = yellow;
                            yellowPencilS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redpencil));
                            isColorSelected = true;
                            colorSelected = red;
                            redPencilS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangepencil));
                            isColorSelected = true;
                            colorSelected = orange;
                            orangePencilS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Pencil");
                            outputText.setTextSize(30);

                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;
                case R.id.bat:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blackbat));
                            isColorSelected = true;
                            blackbatS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bluebat));
                            colorSelected = blue;
                            bluebatS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greenbat));
                            isColorSelected = true;
                            greenbatS.start();
                            colorSelected = green;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Bat");
                            outputText.setTextSize(30);
                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowbat));
                            isColorSelected = true;
                            yellowbatS.start();
                            colorSelected = yellow;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redbat));
                            isColorSelected = true;
                            redbatS.start();
                            colorSelected = red;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangebat));
                            isColorSelected = true;
                            orangebatS.start();
                            colorSelected = orange;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Bat");
                            outputText.setTextSize(30);

                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;

                case R.id.pen:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blackpen));
                            isColorSelected = true;
                            blackPenS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bluepen));
                            bluePenS.start();
                            colorSelected = blue;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greenpen));
                            isColorSelected = true;
                            greenPenS.start();
                            colorSelected = green;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowpen));
                            isColorSelected = true;
                            yellowPenS.start();;
                            colorSelected = yellow;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redpen));
                            isColorSelected = true;
                            redPenS.start();
                            colorSelected = red;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangepen));
                            isColorSelected = true;
                            orangePenS.start();
                            colorSelected = orange;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Pen");
                            outputText.setTextSize(30);

                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;
                case R.id.chair:
                    switch (id) {
                        case R.id.black:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.blackchair));
                            isColorSelected = true;
                            blackChairS.start();
                            colorSelected = black;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Black Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.blue:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bluechair));
                            colorSelected = blue;
                            blueChairS.start();

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Blue Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.green:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.greenchair));
                            isColorSelected = true;
                            greenChairS.start();
                            colorSelected = green;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Green Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.yellow:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.yellowchair));
                            isColorSelected = true;
                            yellowChairS.start();
                            colorSelected = yellow;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Yellow Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.red:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.redchair));
                            isColorSelected = true;
                            redChairS.start();
                            colorSelected = red;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Red Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.orange:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.orangechair));
                            isColorSelected = true;
                            orangeChairS.start();
                            colorSelected = orange;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Orange Chair");
                            outputText.setTextSize(30);

                            break;

                        case R.id.ball:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.ball));
                            ballS.start();
                            isShapeSelected=true;
                            shapeSelected = ball;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Ball");
                            outputText.setTextSize(30);

                            break;
                        case R.id.bat:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.bat));
                            isShapeSelected=true;
                            batS.start();
                            shapeSelected = bat;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Bat");
                            outputText.setTextSize(30);

                            break;
                        case R.id.chair:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.chair));
                            isShapeSelected=true;
                            chairS.start();
                            shapeSelected = chair;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Chair");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pen:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pen));
                            isShapeSelected=true;
                            penS.start();
                            shapeSelected = pen;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pen");
                            outputText.setTextSize(30);

                            break;
                        case R.id.pencil:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.pencil));
                            isShapeSelected=true;
                            pencilS.start();
                            shapeSelected = pencil;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Pencil");
                            outputText.setTextSize(30);

                            break;
                        case R.id.table:
                            objectImages.setBackground(getResources().getDrawable(R.drawable.table));
                            isShapeSelected=true;
                            tableS.start();
                            shapeSelected = table;

                            output.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            objectImages.setVisibility(View.VISIBLE);
                            outputText.setTextColor(Color.parseColor("#000000"));
                            outputText.setText("Table");
                            outputText.setTextSize(30);

                            break;
                    }
                    break;

            }

        }



    }
}
