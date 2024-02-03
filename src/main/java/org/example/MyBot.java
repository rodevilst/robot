package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MyBot extends TelegramLongPollingBot {
    String chat_id = "243837581";
    MyBot myBot = this; // initialize myBot with this instance of the class

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            if (text.equals("/start")) {
                SendMessage message = new SendMessage();
                message.setChatId(update.getMessage().getChatId());
                message.setText("Выберите цвет:");

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                keyboardMarkup.setSelective(true);
                keyboardMarkup.setResizeKeyboard(true);
                keyboardMarkup.setOneTimeKeyboard(false);

                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                row1.add(new KeyboardButton("Зайти"));
                row1.add(new KeyboardButton("Выйти"));
                row1.add(new KeyboardButton("Центр"));
                keyboard.add(row1);
                KeyboardRow row2 = new KeyboardRow();
                row2.add(new KeyboardButton("Вправо"));
                row2.add(new KeyboardButton("Влево"));
                row2.add(new KeyboardButton("Нажать"));
                keyboard.add(row2);
                KeyboardRow row3 = new KeyboardRow();
                row3.add(new KeyboardButton("Вверх"));
                row3.add(new KeyboardButton("Вниз"));
                row3.add(new KeyboardButton("esc"));
                keyboard.add(row3);

                KeyboardRow row4 = new KeyboardRow();
                row4.add(new KeyboardButton("Зажать"));
                row4.add(new KeyboardButton("Отжать"));
                row4.add(new KeyboardButton("Шифт"));
                keyboard.add(row4);

                keyboardMarkup.setKeyboard(keyboard);
                message.setReplyMarkup(keyboardMarkup);

                try {
                    execute(message); // отправить сообщение
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (text.equals("Зайти")) {
                new Thread(() -> {
                    try {
                        executeAction1();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Выйти")) {
                new Thread(() -> {
                    try {
                        executeAction2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Центр")) {
                new Thread(() -> {
                    try {
                        executeAction3();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Вправо")) {
                new Thread(() -> {
                    try {
                        executeAction4();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Влево")) {
                new Thread(() -> {
                    try {
                        executeAction5();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Нажать")) {
                new Thread(() -> {
                    try {
                        executeAction6();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Вверх")) {
                new Thread(() -> {
                    try {
                        executeAction7();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Вниз")) {
                new Thread(() -> {
                    try {
                        executeAction8();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("esc")) {
                new Thread(() -> {
                    try {
                        executeAction9();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Зажать")) {
                new Thread(() -> {
                    try {
                        executeAction10();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (text.equals("Отжать")) {
                new Thread(() -> {
                    try {
                        executeAction11();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
    }

    private void executeAction1() throws AWTException, InterruptedException, IOException, TelegramApiException {
        Robot robot = new Robot();
        robot.mouseMove(1286, 730);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(5000);
        robot.keyRelease(KeyEvent.VK_W);
    }

    private void executeAction2() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
        robot.mouseMove(1643, 1170);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    private void executeAction3() throws AWTException {
        Robot robot = new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width / 2;
        int centerY = screenSize.height / 2;
        robot.mouseMove(centerX, centerY);
    }

    private void executeAction4() throws AWTException {
        Robot robot = new Robot();
        Point currentPos = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(currentPos.x + 100, currentPos.y);
    }

    private void executeAction5() throws AWTException {
        Robot robot = new Robot();
        Point currentPos = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(currentPos.x - 100, currentPos.y);
    }

    private void executeAction6() throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    private void executeAction7() throws AWTException {
        Robot robot = new Robot();
        Point currentPos = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(currentPos.x, currentPos.y - 100);
    }

    private void executeAction8() throws AWTException {
        Robot robot = new Robot();
        Point currentPos = MouseInfo.getPointerInfo().getLocation();
        robot.mouseMove(currentPos.x, currentPos.y + 100);
    }

    private void executeAction9() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }


    private void executeAction10() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3600000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    private void executeAction11() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        while (true) {
            robot.mouseWheel(-100);  // Scroll the mouse wheel downwards by 10 units
        }
    }



    @Override
    public String getBotUsername() {
        return "Minerost_bot";
    }

    @Override
    public String getBotToken() {
        return "6048179771:AAGyWLKLie6ymOpoSFVywfcVNBn1GebYerg";
    }

}

