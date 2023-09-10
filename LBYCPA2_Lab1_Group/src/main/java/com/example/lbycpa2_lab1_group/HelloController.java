package com.example.lbycpa2_lab1_group;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void StaticArrayClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StaticArray.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void DynamicArrayClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DynamicArray.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void SinglyLinkedListClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SinglyLinkedList.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void DoublyLinkedListClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DoublyLinkedList.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void StackClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Stack.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void QueueClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Queue.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void BinarySearchTreeClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BinarySearchTree.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void HashTableClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HashTable.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
