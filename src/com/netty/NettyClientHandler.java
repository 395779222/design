package com.netty;

import java.io.UnsupportedEncodingException;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
public class NettyClientHandler extends ChannelHandlerAdapter  {
  
  private  ByteBuf firstMessage;
  
  public NettyClientHandler(){
	    byte[] data = "服务器，给我一个APPLE".getBytes();
	    System.out.println("向服务端请求：服务器，给我一个APPLE");
	    firstMessage=Unpooled.buffer();
	    firstMessage.writeBytes(data);
  }
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    ctx.writeAndFlush(firstMessage);
    System.out.println("客户端Active");
  }
  public void channelRead(ChannelHandlerContext ctx, Object msg)
      throws Exception {
      ByteBuf buf = (ByteBuf) msg;
	  String rev = getMessage(buf);
	  System.out.println("客户端收到服务器数据:" + rev);
  }
  private String getMessage(ByteBuf buf) {
    byte[] con = new byte[buf.readableBytes()];
    buf.readBytes(con);
    try {
      return new String(con, "utf-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      return null;
    }
  }
}
