using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public enum TaskType {downloadData, ClearGarbage , task1}

public class TaskManager : MonoBehaviour
{
    [SerializeField]
    GameObject interactPanel;

    public List<GameObject> tasks = new List<GameObject>();

    TaskInteract actualTask;


    public void ShowInteractPanel(bool value) {
        interactPanel.SetActive(value);
    }

    public void DoTask(TaskInteract theTask) {
        tasks[(int)theTask.type].SetActive(true);
    }

}
