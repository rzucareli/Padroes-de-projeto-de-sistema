package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.Document;

import java.util.LinkedList;

@EqualsAndHashCode(callSuper = true)
@Data

public class Assembly extends Document {
    /**
	 * 
	 */
	private static final long serialVersionUID = -9103792658302394297L;
	private LinkedList<Piece> pieces;
    private String name;
    private int id;
    private Context context;

    public Assembly(Context context){
        this.context = context;
    }
}
