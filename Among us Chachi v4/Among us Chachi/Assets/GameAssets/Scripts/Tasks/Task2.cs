using System;
using System.Collections;
using UnityEngine;
using UnityEngine.UI;


public class Task2 : MonoBehaviour
{
    int contador = 0;
    public void complete() {
       

        FindObjectOfType<TaskManager>().FinishTask(true);
        contador++;
        Debug.Log(contador.ToString());

        if (contador >= 4)
        {
            TaskManager.instance.FinishTask(true);
        }
    }

}