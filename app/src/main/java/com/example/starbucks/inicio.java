package com.example.starbucks;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class inicio extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        TextView texto = findViewById(R.id.texto_arriba);
        String user = getIntent().getStringExtra("USER");

        texto.setText("¡BIENVENIDO " + user.toUpperCase() + "!");

        CardView cardViewChocoCoffee = findViewById(R.id.card_view_choco_coffee);
        CardView cardViewCapuccino = findViewById(R.id.card_view_cappuccino);
        CardView cardViewCaramelCoffee = findViewById(R.id.card_view_caramel_coffee);
        CardView cardViewSiroupCoffee = findViewById(R.id.card_view_siroup_coffee);
        CardView cardViewMixedTentations= findViewById(R.id.card_view_mixed_sensations);
        CardView cardViewIcedMacchiato = findViewById(R.id.card_view_ice_macchiato);
        CardView cardViewOreoTentations= findViewById(R.id.card_view_oreo_tentation);
        CardView cardViewAppleSmoothie = findViewById(R.id.card_view_apple_smoothie);


        cardViewChocoCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = getLayoutInflater().inflate(R.layout.detalle_producto, null);

                ImageView imageView = dialogView.findViewById(R.id.detalles_imagen);
                TextView nombreTextView = dialogView.findViewById(R.id.detalles_nombre);
                TextView descripcionTextView = dialogView.findViewById(R.id.detalles_descripcion);

                imageView.setImageResource(R.drawable.product1);
                nombreTextView.setText("Choco Coffee");
                descripcionTextView.setText("Una deliciosa mezcla de café fuerte con un" +
                        " toque de chocolate, creando una experiencia única para los amantes" +
                        " del chocolate y el café.");

                AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setView(dialogView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardViewCapuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = getLayoutInflater().inflate(R.layout.detalle_producto, null);

                ImageView imageView = dialogView.findViewById(R.id.detalles_imagen);
                TextView nombreTextView = dialogView.findViewById(R.id.detalles_nombre);
                TextView descripcionTextView = dialogView.findViewById(R.id.detalles_descripcion);

                imageView.setImageResource(R.drawable.product2);
                nombreTextView.setText("Capuccino");
                descripcionTextView.setText("Un clásico italiano, el cappuccino combina un expreso" +
                        " fuerte con leche vaporizada y espuma de leche, " +
                        "resultando en una bebida cremosa y equilibrada.");

                AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setView(dialogView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardViewCapuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = getLayoutInflater().inflate(R.layout.detalle_producto, null);

                ImageView imageView = dialogView.findViewById(R.id.detalles_imagen);
                TextView nombreTextView = dialogView.findViewById(R.id.detalles_nombre);
                TextView descripcionTextView = dialogView.findViewById(R.id.detalles_descripcion);

                imageView.setImageResource(R.drawable.product2);
                nombreTextView.setText("Capuccino");
                descripcionTextView.setText("Un clásico italiano, el cappuccino combina un expreso" +
                        " fuerte con leche vaporizada y espuma de leche, " +
                        "resultando en una bebida cremosa y equilibrada.");

                AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setView(dialogView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardViewCaramelCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = getLayoutInflater().inflate(R.layout.detalle_producto, null);

                ImageView imageView = dialogView.findViewById(R.id.detalles_imagen);
                TextView nombreTextView = dialogView.findViewById(R.id.detalles_nombre);
                TextView descripcionTextView = dialogView.findViewById(R.id.detalles_descripcion);

                imageView.setImageResource(R.drawable.product3);
                nombreTextView.setText("Caramel Coffee");
                descripcionTextView.setText("Un café suave y aterciopelado, realzado con un" +
                        "delicioso jarabe de caramelo que aporta un dulzor sutil" +
                        "y una nota caramelizada.");

                AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setView(dialogView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardViewSiroupCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = getLayoutInflater().inflate(R.layout.detalle_producto, null);

                ImageView imageView = dialogView.findViewById(R.id.detalles_imagen);
                TextView nombreTextView = dialogView.findViewById(R.id.detalles_nombre);
                TextView descripcionTextView = dialogView.findViewById(R.id.detalles_descripcion);

                imageView.setImageResource(R.drawable.product5);
                nombreTextView.setText("Siroup Coffee");
                descripcionTextView.setText("Una experiencia única que combina un café robusto" +
                        "con un toque de jarabe de arce, brindando una dulzura natural" +
                        "y un sabor ahumado.");

                AlertDialog.Builder builder = new AlertDialog.Builder(inicio.this);
                builder.setView(dialogView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}

/*
* Una deliciosa mezcla de café fuerte con un toque de chocolate, creando una experiencia única para los amantes del chocolate y el café.
Cappuccino:

Un clásico italiano, el cappuccino combina un expreso fuerte con leche vaporizada y espuma de leche, resultando en una bebida cremosa y equilibrada.
Caramel Coffee:

Un café suave y aterciopelado, realzado con un delicioso jarabe de caramelo que aporta un dulzor sutil y una nota caramelizada.
Oreo Tentation:

Una creación tentadora que fusiona la cremosidad de la leche con trozos de galleta Oreo, creando una experiencia indulgente y deliciosa.
Siroup Coffee:

Una experiencia única que combina un café robusto con un toque de jarabe de arce, brindando una dulzura natural y un sabor ahumado.
Mixed Sensations:

Una explosión de sabores que combina café, leche y una selección de especias exóticas, creando una experiencia sensorial inigualable.
Apple Smoothie:

Una bebida refrescante que combina trozos de manzana fresca con yogurt y hielo, resultando en una mezcla suave y revitalizante.
Ice Macchiato:

Una variante refrescante de café, donde el expreso se vierte sobre hielo y se corona con una capa de leche espumosa.*/