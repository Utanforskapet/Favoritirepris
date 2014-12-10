package johanna.favoritirepris;

import android.app.Activity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


public class HelveteKaffe extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    Button imageButton1, imageButton2, imageButton3,
    imageButton4, imageButton5, imageButton6,
    imageButton7, imageButton8, imageButton9,
    imageButton10, imageButton11, imageButton12;

    final Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helvete_kaffe);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        View.OnClickListener buttonListener =  new View.OnClickListener(){

            public void onClick(View v)
            {
                if(v.getId() == R.id.imageButton1)
                {

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    imageButton1.setOnClickListener(null);
                                    imageButton1.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton2)
                {

                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,int id) {
                                            // if this button is clicked, just close
                                            // the dialog box and do nothing

                                            imageButton2.setOnClickListener(null);
                                            imageButton2.setBackgroundResource(R.drawable.kaffenej);
                                            dialog.cancel();
                                        }
                                    }

                            );

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton3)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton3.setOnClickListener(null);
                                    imageButton3.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton4)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton4.setOnClickListener(null);
                                    imageButton4.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton5)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton5.setOnClickListener(null);
                                    imageButton5.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton6)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton6.setOnClickListener(null);
                                    imageButton6.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton7)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton7.setOnClickListener(null);
                                    imageButton7.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton8)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton8.setOnClickListener(null);
                                    imageButton8.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton9)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton9.setOnClickListener(null);
                                    imageButton9.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton10)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton10.setOnClickListener(null);
                                    imageButton10.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }

                if(v.getId() == R.id.imageButton11)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Vill du köpa en varm dryck?")
                            .setCancelable(false)
                            .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton11.setOnClickListener(null);
                                    imageButton11.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }




                if(v.getId() == R.id.imageButton12)
                {
                    //Dialogruta
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                    //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                    alertDialogBuilder
                            .setMessage("Information?")
                            .setCancelable(false)
                            .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, close
                                    // MainCoffee.this.finish();
                                    dialog.cancel();
                                }
                            })
                            .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // if this button is clicked, just close
                                    // the dialog box and do nothing
                                    imageButton11.setOnClickListener(null);
                                    imageButton11.setBackgroundResource(R.drawable.kaffenej);
                                    dialog.cancel();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();

                }
            }

        };

        imageButton1 = (Button) findViewById(R.id.imageButton1);
        imageButton2 = (Button) findViewById(R.id.imageButton2);
        imageButton3 = (Button) findViewById(R.id.imageButton3);
        imageButton4 = (Button) findViewById(R.id.imageButton4);
        imageButton5 = (Button) findViewById(R.id.imageButton5);
        imageButton6 = (Button) findViewById(R.id.imageButton6);

        imageButton7 = (Button) findViewById(R.id.imageButton7);
        imageButton8 = (Button) findViewById(R.id.imageButton8);
        imageButton9 = (Button) findViewById(R.id.imageButton9);
        imageButton10 = (Button) findViewById(R.id.imageButton10);
        imageButton11 = (Button) findViewById(R.id.imageButton11);
        imageButton12 = (Button) findViewById(R.id.imageButton12);


        imageButton1.setOnClickListener(buttonListener);
        imageButton2.setOnClickListener(buttonListener);
        imageButton3.setOnClickListener(buttonListener);
        imageButton4.setOnClickListener(buttonListener);
        imageButton5.setOnClickListener(buttonListener);
        imageButton6.setOnClickListener(buttonListener);

        imageButton7.setOnClickListener(buttonListener);
        imageButton8.setOnClickListener(buttonListener);
        imageButton9.setOnClickListener(buttonListener);
        imageButton10.setOnClickListener(buttonListener);
        imageButton11.setOnClickListener(buttonListener);
        imageButton12.setOnClickListener(buttonListener);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3); // Öppettider
                Intent intent3 = new Intent(this, Oppettider.class);
                startActivity(intent3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4); // Hitta hit
                Intent intent4 = new Intent(this, HittaHit.class);
                startActivity(intent4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5); // Kontankt
                Intent intent5 = new Intent(this, Kontakt.class);
                startActivity(intent5);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.helvete_kaffe, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_helvete_kaffe, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((HelveteKaffe) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
