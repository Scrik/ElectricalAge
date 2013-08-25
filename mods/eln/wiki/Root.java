package mods.eln.wiki;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.attribute.standard.SheetCollate;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import mods.eln.Eln;
import mods.eln.gui.GuiHelper;
import mods.eln.gui.GuiScreenEln;
import mods.eln.gui.GuiTextFieldEln;
import mods.eln.gui.IGuiObject;
import mods.eln.misc.Utils;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.Icon;

public class Root extends GuiScreenEln{

	public Root() {

	}


	GuiButton toogleDefaultOutput;
	GuiTextFieldEln searchText;

	@Override
	public void initGui() {
		// TODO Auto-generated method stub
		super.initGui();

		toogleDefaultOutput = newGuiButton(6, 64/2-10,115, "toogle switch");
		searchText = newGuiTextField(0, 0, 100);

	}
	ArrayList<ItemStack> searchList = new ArrayList<ItemStack>();
	@Override
	public void guiObjectEvent(IGuiObject object) {
		// TODO Auto-generated method stub
		super.guiObjectEvent(object);
    	if(object == toogleDefaultOutput){
    	
    	}
    	else if(object == searchText){
    		Utils.clientOpenGui(new Search(searchText.getText()));	
    	}
	}
	@Override
	protected void preDraw(float f, int x, int y) {
		// TODO Auto-generated method stub
		super.preDraw(f, x, y);

	}
	
	
	@Override
	protected void postDraw(float f, int x, int y) {
		// TODO Auto-generated method stub
		super.postDraw(f, x, y);

	}

	@Override
	protected GuiHelper newHelper() {
		// TODO Auto-generated method stub
		return helper = new GuiHelper(this, 128, 64);
	}


	GuiHelper helper;
	
	
	
}
