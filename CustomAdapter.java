package com.example.hp.be_chess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class CustomAdapter extends BaseAdapter {

    GridView parent;
    Context mContext;
    PieceData d[];

    int[] bgImages = {R.drawable.ic_basesquare, R.drawable.ic_basesquare2};
    int[] white = {R.drawable.king_w, R.drawable.queen_w, R.drawable.rook_w, R.drawable.bishop_w, R.drawable.knight_w, R.drawable.pawn_w,};
    int[] black = {R.drawable.king_b, R.drawable.queen_b, R.drawable.rook_b, R.drawable.bishop_b, R.drawable.knight_b, R.drawable.pawn_b,};
    int[] blank = {R.drawable.blank, R.drawable.blank_s};
    @Override
    public int getCount() {
        return 64;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public CustomAdapter(Context context) {
        mContext = context;
    }

    public void setData(PieceData[] data) {
        this.d = data;
        this.parent.invalidateViews();
    }
    //finding which piece to display where
    public int getImageResource(PieceData data, int sel) {
        PieceType type = data.type;
        boolean isWhite = data.isWhite;
        int a = sel * 6 ;

        if(isWhite) {
            switch(type) {
                case KING: return white[a+0];
                case QUEEN: return white[a+1];
                case ROOK: return white[a+2];
                case BISHOP: return white[a+3];
                case KNIGHT: return white[a+4];
                case PAWN: return white[a+5];
                default:return blank[sel];
            }
        } else {
            switch(type) {
                case KING: return black[a+0];
                case QUEEN: return black[a+1];
                case ROOK: return black[a+2];
                case BISHOP: return black[a+3];
                case KNIGHT: return black[a+4];
                case PAWN: return black[a+5];
                default:return blank[sel];
            }
        }
    }


    public void setParent(ViewGroup parent)
    {
        this.parent = (GridView)parent;
        System.out.println(this.parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int parentWidth = parent.getMeasuredWidth();
        int squareWidth = parentWidth / 8;
        View squareView;
      //  if (true) {
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
           squareView = new View(mContext);
            squareView = layoutInflater.inflate(R.layout.square,null);
            /*ViewGroup.LayoutParams containerParams = squareView.getLayoutParams();
            if (containerParams == null) {
                containerParams = new ViewGroup.LayoutParams(squareWidth, squareWidth);
            }

            containerParams.width = squareWidth;
            containerParams.height = squareWidth;
            squareView.setLayoutParams(containerParams);
*/
            ImageView background = (ImageView) squareView.findViewById(R.id.square_background);
            background.setImageResource(bgImages[(position + position / 8) % 2]);
            //alternate black and white shortcut

            /*PieceButton pieceView = (PieceButton) squareView.findViewById(R.id.piece);
            pieceView.setImageResource(getImageResource(d[position], 0));
            pieceView.setTag(position);*/
/*
            pieceView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SquareAdapter adapter = SquareAdapter.this;
                    PieceButton piece = (PieceButton) view;
                    Log.i("A", "Piece: " + piece.getTag() + ": " + piece.selected);
                    if(piece.selected) {
                        if(piece.equals(adapter.firstPiece)) {
                            adapter.firstPiece = null;
                            if(adapter.secondSelected != -1) {
                                adapter.secondPiece.setImageResource(getImageResource(data[(Integer) adapter.secondPiece.getTag()], 0));
                                adapter.secondPiece.selected = false;
                            }
                            adapter.secondPiece = null;
                            adapter.firstSelected = -1;
                            adapter.secondSelected = -1;
                        } else if(piece.equals(adapter.secondPiece)) {
                            adapter.secondPiece = null;
                            adapter.secondSelected = -1;
                        }
                        piece.setImageResource(getImageResource(data[(Integer)piece.getTag()],0));
                        piece.selected = false;

                    } else {
                        if(adapter.firstSelected == -1) {
                            adapter.firstSelected = (Integer)piece.getTag();
                            adapter.firstPiece = piece;
                        } else {
                            if(adapter.secondSelected != -1) {
                                adapter.secondPiece.setImageResource(getImageResource(data[(Integer)adapter.secondPiece.getTag()],0));
                                adapter.secondPiece.selected = false;
                            }
                            adapter.secondPiece = piece;
                            adapter.secondSelected = (Integer)piece.getTag();
                        }
                        piece.setImageResource(getImageResource(data[(Integer)piece.getTag()],1));
                        piece.selected = true;
                        Log.i("A", "First Piece:" + adapter.firstSelected);
                        Log.i("A", "Second Piece:" + adapter.secondSelected);
                    }
                }
            }); TextView textView = (TextView) squareContainerView.findViewById(R.id.square_label);
            String text = Position.convertToChessString(position);
            textView.setText("");*/


            return squareView;
        }
        /*else {
            squareContainerView = (RelativeLayout) convertView;
            ViewGroup.LayoutParams containerParams = convertView.getLayoutParams();
            containerParams.width = squareWidth;
            containerParams.height = squareWidth;
            squareContainerView.setLayoutParams(containerParams);
            PieceButton pieceView = (PieceButton)squareContainerView.findViewById(R.id.piece);
            pieceView.setImageResource(getImageResource(data[(Integer)pieceView.getTag()],(pieceView.selected? 1:0)));

            return squareView;

        }
       return convertView;*/

}
