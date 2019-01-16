package drmas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MoveRect extends JPanel {
	private static final int RECT_W = 90;
	private static final int RECT_H = 70;
	private static final int PREF_W = 600;
	private static final int PREF_H = 300;
	
	private static final Color DRAW_RECT_COLOR = Color.black;
	private static final Color DRAG_RECT_COLOR = new Color(180, 200, 255);
	private boolean dragging =false;
	private int deltaX = 0;
	private int deltaY = 0;
	

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(PREF_W, PREF_H);
	}
	

}
