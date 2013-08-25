package mods.eln.gui;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

public class GuiHelpText extends Gui implements IGuiObject{

    public int width,height,xPosition,yPosition;
	private GuiHelper helper;


	public GuiHelpText(int xPosition,int yPosition,GuiHelper helper) 
	{
		this.xPosition = xPosition;
		this.yPosition = yPosition;	
		this.helper = helper;	
		width = 20;
		height = 20;
	}
	
	
	@Override
	public int getYMax() {
		// TODO Auto-generated method stub
		return yPosition + height;
	}
	
	
	@Override
	public void idraw(int x, int y, float f) {
		drawRect(xPosition, yPosition-2,xPosition + width,yPosition + height+2,0xFF404040);
		drawRect(xPosition+1, yPosition-1,xPosition + width-1,yPosition + height+1,0xFF606060);
		drawRect(xPosition+2, yPosition,xPosition + width-2,yPosition + height,0xFF808080);


        this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, "?", this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, 0xFF);
	}



	@Override
	public boolean ikeyTyped(char key, int code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imouseClicked(int x, int y, int code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imouseMove(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imouseMovedOrUp(int x, int y, int witch) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void translate(int x, int y) {
		this.xPosition += x;
		this.yPosition += y;
	}
	
	
	ArrayList<String> comment = new ArrayList<String>();
	
	public void setComment(String[] comment)
	{
		this.comment.clear();
		for(String str : comment)
		{
			this.comment.add(str);
		}
	}
	
	public void setComment(int line,String comment)
	{
		if(this.comment.size() < line + 1)
			this.comment.add(line, comment);
		else
			this.comment.set(line, comment);
	}
	
	@Override
	public void idraw2(int x, int y) {
		// TODO Auto-generated method stub
		if(/*visible == true && */(x >= xPosition && y >= yPosition && x < xPosition + width && y < yPosition + height))
		{
			/*int px,py;
			px = xPosition - helper.getHoveringTextWidth(comment,Minecraft.getMinecraft().fontRenderer)/2;
			py = yPosition + height + 20;*/
			helper.drawHoveringText(comment, x, y, Minecraft.getMinecraft().fontRenderer);
		}
				
	}

}
