package com.tit.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String data = "Message " + i + "\n";
                outputStream.write(data.getBytes());
                System.out.println("Written: " + data);
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("WriterThread error: " + e.getMessage());
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                System.err.println("Error closing output stream: " + e.getMessage());
            }
        }
    }
}
